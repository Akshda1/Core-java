package iff.elsee;
import java.util.*;

public class LeapYear {
	public static void main(String[] args) {
		System.out.println("entre a year to check wether is is leap year or not");
		Scanner sc=new Scanner(System.in);
		int year=sc.nextInt();
		if((year%4==0 && year%100!=0) ||year%400==0) {
			System.out.println("mention year is a leap year");
		}else {
			System.out.println("no a leap year");
		}
		
	}

}
