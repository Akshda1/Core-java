package loop.qus;

public class Prime {
public static void main(String[] args) {
	int num=7;
	int count=0;
	for(int i=2;i<=num-1;i++) {
		if(num%i==0) {
			count++;
			System.out.println("factor are:"+i);
			}
			
	}if(count>0) {
		System.out.println("no is non prime");
	}else {
		System.out.println("no is prime,no factor");
	}
}
}
