package Encapsulation;

class ICICIApplication {
	
	private int balance = 1000;
	
	private int withdraw = 999;
	

	public int getBalance() {
		return balance;
	}
	
	public void setBalance(int balance) {
		this.balance = balance;
	}

	public int getWithdraw() {
				
		return withdraw;
	}

	public void setWithdraw(int withdraw){
		this.withdraw = withdraw;
	}

}

public class ICICIGetSetMrthods
{
	public static void main(String[] args) {
		
		ICICIApplication app = new ICICIApplication();
		
		System.out.println(app.getBalance());
		
		System.out.println(app.getWithdraw());

		
		
		
	}
}



