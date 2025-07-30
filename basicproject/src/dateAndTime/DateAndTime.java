package dateAndTime;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateAndTime {
	public static void main(String[] args) throws ParseException {
		Date d= new Date();
		System.out.println("System format:"+d);
		
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
		String s=sdf.format(d);
		System.out.println("after format:"+s);
		
		String dob="05/06/1998";
		SimpleDateFormat sdf1=new SimpleDateFormat("dd/MM/yyyy");
		Date d1=sdf1.parse(dob);
		System.out.println("date format:"+ d1);
	}
}
