package iff.elsee;

public class GreatestIn3 {
	public static void main(String args[]) {
		int n1=15;
		int n2=18;
		int n3=11;
		
		if(n1>n2&&n1>n3) {
			System.out.println("n1 is the greatest:" +n1);
		}else if(n2>n1&&n2>n3) {
			System.out.println("n2 is the greatest:" +n2);
		}else {
			System.out.println("n3 is the greatest:" +n3);
		}
		
	}

}
