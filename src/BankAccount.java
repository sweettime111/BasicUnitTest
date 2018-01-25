
public class BankAccount {
	
	private int Balance;
	
	public BankAccount() {
		Balance = 0 ;
	}

	public BankAccount(int i) {
		Balance = i ;
	}


	public void deposit(int i) {
		
		Balance += i;
		
	}


	public int getBalance() {
		return Balance;
	}


	public void WithDraw(int i) {
		Balance -= i;
		
	}

}
