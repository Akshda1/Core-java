package loop.qus;

public class Factorial2 {
	public static void main(String[] args) {
		long n=13l;
		long fact=1l;
		
		
		for(long i=1l;i<=n;i++) {
			fact=fact*i;
		}System.out.println(fact);
	}

}
