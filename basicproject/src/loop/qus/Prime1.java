package loop.qus;

public class Prime1 {
	public static void main(String args[]) {
		int n=12;
		int count=0;
		for(int i=2;i<=n-1;i++) {
			if(n%i==0) {
				count++;
				System.out.println("factor of number is:"+i);
			}	
		}if(count>0) {
			System.out.println("no is not prime");
		}else {
			System.out.println("number is prime");
		}
		
	}

}
