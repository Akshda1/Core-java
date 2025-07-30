package loop.qus;

public class Armstrong1 {
	public static void main(String[] args) {
		int num=153;
		int numis=num;
		int sum=0;
		while(num!=0) {
			int lastdigit=num%10;
			sum=sum+(lastdigit*lastdigit*lastdigit);
			num=num/10;  //number short
			
		}System.out.println("sum is:"+sum);
		
		if(sum==numis) {
			System.out.println("no is armstron,sum is:"+sum+" number was:"+numis);
		}
	}

}
