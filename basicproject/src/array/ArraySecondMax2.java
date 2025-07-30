package array;

public class ArraySecondMax2 {
	public static void main(String[] args) {
		int arr[]= {25,65,98,32,856,3695,4565,254,9633,2145};
	    int max=Integer.MIN_VALUE;
	    int max2=Integer.MIN_VALUE;
	    
	    for(int a:arr) {
	    	if(max<a) {
	    		max=a;
	    	}
	    }System.out.println("max value:"+max);
	    for(int a:arr) {
	    	if(max2<a&&a!=max) {
	    		max2=a;
	    	}
	    }System.out.println("secondmax value :"+max2);
	
	}
	

}
