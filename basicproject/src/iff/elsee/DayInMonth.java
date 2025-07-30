package iff.elsee;
//9 4 11 6==30days//2==28//rest 31
public class DayInMonth {
	public static void main(String[] args) {
		
	int num=2;
	
	if(num==9||num==4||num==11||num==6) {
		System.out.println("this month has 30 days ");
	}else if(num==2) {
		System.out.println("this month has 28/29 days");
	}else {
		System.out.println("this month has 31 days");
	}

	}
}
