import static org.junit.Assert.*;



import org.junit.Test;

public class BankAccountTest {

	@Test
	public void testDeposit(){
		BankAccount acc = new BankAccount();
		acc.deposit(50);
		assertEquals(acc.getBalance(),50);
	}
	@Test
	public void testWithDraw(){
		BankAccount acc = new BankAccount(75);
		acc.WithDraw(50);
		assertEquals(acc.getBalance(),25);
	}


}
