package loop.qus;

public class Armstrong {
	public static void main(String[] args) {

		int num = 153;
		int a = num;
		int v = 0;
		int exp = 3; 

		while (num != 0) {
			int ld = num % 10;
			v = (int) (v + (Math.pow(ld, exp)));
			num = num / 10;

		}
		if (a == v) {
			System.out.println("this num is Armstrong");
		} else {
			System.out.println("not Armstrong");
		}

	}
}
