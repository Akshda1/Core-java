package rays.com.oops;

public class Account {
	private String name;
	private String accountnumber;
	private String accounttype;
	private int balance;
	
	public void setName(String s) {
		this.name=s;
	}
	public String getName() {
		return this.name;
	}
	public void setAccountnumber(String i) {
		this.accountnumber=i;
	}
	public String getAccountnumber() {
		return this.accountnumber;
	}
	public void SetAccounttype(String i) {
		this.accounttype=i;
	}
	public String getAccounttype() {
		return this.accounttype;
	}
	public void setBalance(int i) {
		this.balance=i;
	}
	public int getBalance() {
		return this.balance;
	}

}
