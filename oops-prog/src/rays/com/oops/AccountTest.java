package rays.com.oops;

public class AccountTest {
	public static void main(String[] args) {
		Account a1=new Account();
		a1.setAccountnumber("abc123454");
		a1.setAccounttype("saving");
		a1.setBalance(12300.21);
		
		System.out.println(a1.getAccountnumber());
		System.out.println(a1.getAccounttype());
		System.out.println(a1.getBalance());
		a1.display();
		a1.withdraw(2000.00);
		a1.fundTransfer("anu:1234abc", 2500);
		
		
		
		
	}
}
