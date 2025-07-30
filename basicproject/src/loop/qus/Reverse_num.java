package loop.qus;

public class Reverse_num {
	public static void main(String[] args) {
		int num=123456;
		int rev=0;
		int ld=0;
		while(num!=0) {
			 ld=num%10;
			 rev=rev*10+ld;
			 num=num/10;
			
		}System.out.println(rev);
	}
	}