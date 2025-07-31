package rays.com.oops;

import java.util.Date;

public class Person1 {
	private String name;
	private String address;
	private Date dob;
	
	public void setName(String s) {
		name=s;
	}
	public String getName() {
		return this.name;
	}
	public void setAddress(String s1) {
		address=s1;
	}
	public String getAddress() {
		return this.address;
	}
	public void setDob(Date d) {
		dob=d;
	}
	public Date getDob() {
		return this.dob;
	}

}
