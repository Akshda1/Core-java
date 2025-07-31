package rays.com.oops;

public class Account {
	private String accountnumber;
	private String accounttype;
	private double balance;
	
	public void setAccountnumber(String str_accountnumber) {
		this.accountnumber=str_accountnumber;
	}
	public String getAccountnumber() {
		return this.accountnumber;
	}
	public void setAccounttype(String Str_accounttype) {
		this.accounttype=Str_accounttype;
	}
	public String getAccounttype() {
		return this.accounttype;
	}
	public void setBalance(double balance) {
		this.balance=balance;
	}
	public double getBalance() {
		return this.balance;
	}
	public void display() {
		System.out.println("account number :"+accountnumber  +" balance is:"+balance +" account type: "+accounttype);
	}
	public double withdraw(double withdraw) {
		System.out.println("whithdraw money:"+withdraw);
		this.balance=this.balance-withdraw;
		System.out.println("balance after withdraw:"+this.balance);
		return this.balance;	
	}
	public void deposite(double amount) {
		this.balance=this.balance+amount;
		System.out.print("Amount after deposite: "+balance);
		
	}
	public void fundTransfer(String s,double amt) {
		
		this.balance=this.balance-amt;
		System.out.println("transfer amount:"+amt);
		System.out.println("amount after transfer:"+ balance);
		System.out.println("fundtransfer account:"+s);
	}

}
