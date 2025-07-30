package iff.elsee;

public class DiscountAbove100 {
	public static void main(String[] args) {
		int price=195;
		int dis=(price*20)/100;
		if(price>100) {
			System.out.println("you will get 20% discount,your bill was:"+price+",after discount it is:"+(price-dis));
		}else {
			System.out.println("there will be no discount,your bill is"+price);
		}
	}

}
