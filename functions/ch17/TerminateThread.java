package ch17;

import java.io.IOException;

public class TerminateThread extends Thread {
	private boolean isFlag = false;
	
	public TerminateThread(String name) {
		super(name);
	}
	
	public void run() {
		while(!isFlag) {
			try {
				sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		System.out.println(super.getName() + " end");
	}
	
	public void setFlag(boolean flag) {
		this.isFlag = flag;
	}

	public static void main(String[] args) throws IOException {
		TerminateThread tt1 = new TerminateThread("A");
		TerminateThread tt2 = new TerminateThread("B");
		TerminateThread tt3 = new TerminateThread("C");
		
		tt1.start();
		tt2.start();
		tt3.start();
	
		int input;
		while(true) {
			input = System.in.read();
			
			if(input == 'A') {
				tt1.setFlag(true);
			} else if(input == 'B') {
				tt2.setFlag(true);
			} else if(input == 'C') {
				tt3.setFlag(true);
			} else if(input == 'M') {
				tt1.setFlag(true);
				tt2.setFlag(true);
				tt3.setFlag(true);
				try {
					sleep(200);
					System.out.println("Thread End");
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				break;
			} 
		}
		
	}

}
