package loop.qus;

public class SumOfNOddNum {
	public static void main(String[] args) {
		int n=50;
		int sum=0;
		for(int i=1;i<=n;i++) {
			if(i%2!=0){
			sum=sum+i;	
			}
		}System.out.println("sum of n odd natural number is:"+sum);
	}

}
