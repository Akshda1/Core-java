package rays.com.oops;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Person1Test {
	public static void main(String[] args) throws ParseException {
		SimpleDateFormat sdf=new SimpleDateFormat("dd-MM-yyyy");
		Person p1=new Person();
		p1.setName("akshda");
		p1.setAddress("indore");
		p1.setDob(sdf.parse("05-06-1998"));
		
		System.out.println(p1.getName());
		System.out.println(p1.getAddress());
		System.out.println(p1.getDob());
		System.out.println(sdf.format(p1.getDob()));
		
		System.out.println("-------------------------------");
		
		Person p2=new Person();
		p2.setName("pranav");
		p2.setAddress("noida");
		p2.setDob(sdf.parse("03-06-1991"));
		
		System.out.println(p2.getName());
		System.out.println(p2.getAddress());
		System.out.println(p2.getDob());
		System.out.println(sdf.format(p2.getDob()));
		
	}

}
