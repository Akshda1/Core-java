package array;

public class ArrayMax {
	public static void main(String[] args) {
		int arr[]= {6,54,85,63,12,11,85,76,1,85,99};
		//int temp=arr[0];
		/*for(int a:arr) {
			if(temp<a) {
				temp=a;
			}
			
		}System.out.println(temp);*/
		
		/*for(int i=0;i<arr.length;i++) {
			if(temp<arr[i]) {
				temp=arr[i];
			}
		}System.out.println(temp);*/
		
		
		int temp=Integer.MIN_VALUE;//minus infinity
		for(int a:arr) {
			if(temp<a) {
				temp=a;
			}
		}System.out.println(temp);
		
	}

}
