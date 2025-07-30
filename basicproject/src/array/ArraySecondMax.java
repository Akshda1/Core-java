package array;

public class ArraySecondMax {
	public static void main(String[] args) {
		int arr[]= {10,80,25,10,35,99,52,45};
		int max=arr[0];
		int secondmax=arr[0];
		for(int a:arr) {
			if(max<a) {
				max=a;	
			}	
		}System.out.println("max no:"+max);
		for(int a:arr) {
			if(secondmax<=a && a!=max) {
				secondmax=a;
			}
			
		}System.out.println("secondmax:"+secondmax);
	}

}
