package ch19;

import java.util.ArrayList;

class Restaurant {
	private int money = 0;
	ArrayList<String> tableList = new ArrayList<>();
	
	public Restaurant() {
		this.money = 0;
		
		tableList.add("1번 테이블");
		tableList.add("2번 테이블");
		tableList.add("3번 테이블");
		tableList.add("4번 테이블");
		tableList.add("5번 테이블");
	}
	
	public synchronized String inTable() throws InterruptedException {
		Thread t = Thread.currentThread();
		while(tableList.size() == 0) {
			System.out.println(t.getName() + " waiting...");
			wait();
			System.out.println(t.getName() + " welcome");
		}
		
		String table = tableList.remove(0);
		System.out.println(t.getName() + " : " + table + " in");
		
		return table;
	}
	
	public synchronized void outTable(String table) {
		Thread t = Thread.currentThread();
		
		tableList.add(table);
		
		notifyAll();
		//notify 는 랜덤으로 깨우고 notifyAll은 모두 깨워서 경쟁을 시킨다. 자바에서는 notifyAll을 권장한다.
		
		System.out.println(t.getName() + " : " + table + " out\t" + table + " 사용 가능");
	}
	
	public void incomeMoney(int money) {
		this.money += money;
		System.out.println("총 매출 : " + this.money + "원");
	}
	
	public int getMoney() {
		return money;
	}
	
	public void setMoney(int money) {
		this.money = money;
	}
}

class Customer extends Thread {
	public Customer(String name) {
		super(name);
	}
	
	public int payMoney(int pay) {
		return pay;
	}
	
	public void run() {
		try {
			String table = ResMain.res.inTable();
			if(table == null) return;
			
			sleep(500);
			ResMain.res.outTable(table);
			
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		synchronized(ResMain.res) {
			
			try {
				sleep(500);
				ResMain.res.incomeMoney(this.payMoney(10000));
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

public class ResMain {
	public static Restaurant res = new Restaurant();
	
	public static void main(String[] args) {
		Customer cus1 = new Customer("cus 01");
		Customer cus2 = new Customer("cus 02");
		Customer cus3 = new Customer("cus 03");
		Customer cus4 = new Customer("cus 04");
		Customer cus5 = new Customer("cus 05");
		Customer cus6 = new Customer("cus 06");
		Customer cus7 = new Customer("cus 07");
		Customer cus8 = new Customer("cus 08");
		Customer cus9 = new Customer("cus 09");
		Customer cus10 = new Customer("cus 10");
		
		cus1.start();
		cus2.start();
		cus3.start();
		cus4.start();
		cus5.start();
		cus6.start();
		cus7.start();
		cus8.start();
		cus9.start();
		cus10.start();
	}

}
