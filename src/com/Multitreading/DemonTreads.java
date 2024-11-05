package com.Multitreading;

class MicrosoftOffice2 extends Thread{
	@Override
	public void run() {
		if(Thread.currentThread().getName().equals("typing")) {
			typing();
		}
		else if(Thread.currentThread().getName().equals("spellCheck")) {
			spellCheck();
		}
		else {
			save();
		}
	}
//	Primary operation
	private void typing() {
		try {
			for(;;) {     //infinite loop
			System.out.println("typing");
			Thread.sleep(4000);
		}
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
//	Secondary operation
	private void spellCheck() {
		try {
			for(;;) {     //infinite loop
				System.out.println("spellCHeck");
				Thread.sleep(4000);
			}
			}
			catch (Exception e) {
				e.printStackTrace();
			}
		
	}
//	Secondary operation
	private void save() {
		try {
			for(int i=0;i<5;i++) {
				System.out.println("saving");
				Thread.sleep(4000);
			}
			}
			catch (Exception e) {
				e.printStackTrace();
			}
		
	}
}

public class DemonTreads {
	public static void main(String[] args) throws InterruptedException {
		MicrosoftOffice2 ms1 = new MicrosoftOffice2();
		MicrosoftOffice2 ms2 = new MicrosoftOffice2();
		MicrosoftOffice2 ms3 = new MicrosoftOffice2();
		
		ms1.setName("typing");
		ms2.setName("spellCheck");
		ms3.setName("save");
		
		ms2.setDaemon(true);  //active daemon
		ms3.setDaemon(true);  //active daemon
		
		ms2.setPriority(8);   //set priority more then 7 for secondary threads
		ms3.setPriority(9);   //set priority more then 7 for secondary threads
		
		
		ms1.start();
		ms2.start();
		ms3.start();
	}
}
