package loop.qus;

public class Even1to100 {
	public static void main(String[] args) {
		
		for (int i = 1; i <= 10; i++) {
			if(i % 2 == 0) {
				System.out.println(i + " is even" );
			} else {
				System.out.println(i +" no is odd");
			}
		
		}
	}
}
