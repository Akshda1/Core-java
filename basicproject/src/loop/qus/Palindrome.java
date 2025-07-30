package loop.qus;

public class Palindrome {
	public static void main(String[] args) {
		int num=1441;
		int an=num;
		int rev=0;
		while(num!=0) {
			int ld=num%10;
			rev=rev*10+ld;
			num=num/10;	
		}if(an==rev) {
			System.out.println("no is palindrome");
		}else {
			System.out.println("not palindrome");
		}
		
	}

}
