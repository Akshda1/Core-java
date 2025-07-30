package array;

public class FindPositionOfNumber {
	public static void main(String[] args) {
		int[] arr= {10,2,36,25,10,85,10,24,6,27,65,85,31};
		int num=20;
		int pos=-1; //any value which not come under index value
		for(int i=0;i<arr.length;i++) {
			if(num==arr[i]) {
				pos=i;
				System.out.println("number is present is array "+i+"="+arr[i]);
			}
		}if(pos==-1) {
			System.out.println("no is not present "+ num);
		}
	}

}
