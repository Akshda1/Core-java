package rays.com.oops;

public class AccountTest {
	public static void main(String[] args) {
		Account p1=new Account();
		Account p2=new Account();
		
		p1.setName("akshda");
		p1.setAccountnumber("abc123");
		p1.SetAccounttype("saving");
		p1.setBalance(1000);
		
		System.out.println(p1.getName());
		System.out.println(p1.getAccountnumber());
		System.out.println(p1.getAccounttype());
		System.out.println(p1.getBalance());
		
		System.out.println("--------------------");
		
		System.out.println("name of holder:"+p1.getName());
		System.out.println("account number:"+p1.getAccountnumber());
		System.out.println("accounttype is:"+p1.getAccounttype());
		System.out.println("balance is:"+p1.getBalance());
		
		System.out.println("-----------------");
		
		p2.setName("pranav");
		p2.setAccountnumber("abc4567");
		p2.SetAccounttype("current");
		p2.setBalance(1000000000);
		
		System.out.println("name of holder:"+p2.getName());
		System.out.println("account number:"+p2.getAccountnumber());
		System.out.println("accounttype is:"+p2.getAccounttype());
		System.out.println("balance is:"+p2.getBalance());
	}

}
