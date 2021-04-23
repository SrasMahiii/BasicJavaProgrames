package Encapsulation;

class Application
{
	private int Balance = 100000;
	
	private int withdraw = 1000;

	public int getBalance() {
		return Balance;
	}

	public void setBalance(int balance) {
		Balance = balance;
	}

	public int getWithdraw() {
		return withdraw;
	}

	public void setWithdraw(int withdraw) {
		this.withdraw = withdraw;
	}	

}

public class HidingData {

	public static void main(String[] args) {

		Application App = new Application();
				
		System.out.println(App.getBalance());
		
		System.out.println(App.getWithdraw());

		
		
	}

}
