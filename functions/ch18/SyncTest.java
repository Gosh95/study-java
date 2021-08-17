package ch18;

class Bank {
	private int money = 10000;
	
	public Bank() {}
	
	public void saveMoney(int save) {
		int current = this.getMoney();
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		this.setMoney(current + save);
	}
	
	public void useMoney(int use) {
		int current = this.getMoney();
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		this.setMoney(current - use);
	}
	
	public int getMoney() {
		return money;
	}
	
	public void setMoney(int money) {
		this.money = money;
	}
	
}

class Park extends Thread {
	@Override
	public void run() {
		synchronized(SyncTest.bank) {
			System.out.println("save money");
			SyncTest.bank.saveMoney(10000);
			System.out.println("save money : " + SyncTest.bank.getMoney());
		}
	}
}

class Kim extends Thread {
	@Override
	public void run() {
		synchronized(SyncTest.bank) {
			System.out.println("use money");
			SyncTest.bank.useMoney(5000);
			System.out.println("use money : " + SyncTest.bank.getMoney());
		}
	}
}

public class SyncTest {
	public static Bank bank = new Bank();
	
	public static void main(String[] args) {
		//동기화를 메서드에 직접 걸거나 블록 방식으로 걸수있다.
		//자바에서는 deadlock을 방지하는 기술이 제공되지 않으므로 되도록이면 
		//synchronized 메서드에서 다른 synchronized 메서드는 호출하지 않도록 한다.
		Park p = new Park();
		Kim k = new Kim();
		
		k.start();
		p.start();
	}

}
