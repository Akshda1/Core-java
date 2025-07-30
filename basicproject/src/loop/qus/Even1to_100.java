package loop.qus;

public class Even1to_100 {
	public static void main(String[] args) {
		/*
		 * int a=2; int b=1; while((a*b)<=100) { int num=a*b; System.out.print(num+" ");
		 * b++; }
		 */
		
		for (int i = 1; i <= 100; i++) {
			if (i % 2 == 0) {
				System.out.print(i+ ":num is even  ");
			}else {
				System.out.print(i+":num is odd  ");
			}
			
		}

	}
}
