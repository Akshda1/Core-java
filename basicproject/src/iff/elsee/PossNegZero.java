package iff.elsee;

public class PossNegZero {
	public static void main(String[] args) {
		float n1=0;
		if(n1>0) {
			System.out.println("no is positive");
		}else if(n1<0) {
			System.out.println("no is negative");
		}else {
			System.out.println("no is zero");
		}
		 if(n1>100000) {
			System.out.println("number is large");
		 }else if(n1>=0&&n1<=1) {
			System.out.println("number is small");
		 }
		
}

}
