package loop.qus;
import java.util.*;

public class SumOf_N_Naturalnum {
	public static void main(String[] args) {
		System.out.println("write value of n");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int sum=0;
		for(int i=1; i<=n;i++) {
			sum=sum+i;	
		}	
		System.out.println("sum of n natural number is:"+sum);
}
}
