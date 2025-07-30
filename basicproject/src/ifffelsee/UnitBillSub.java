package ifffelsee;

public class UnitBillSub {
	public static void main(String[] args) {
		int unit=1;
		int price=10;
		int totalprice=unit*price;
		if(totalprice>=100) {
			System.out.println("you get subsidy of 100 rupees, your total bill was:"+totalprice +",now your bill is:"+(totalprice-100));
		}else{
			System.out.println("not generate any bill ^_^  ");
			}
	}

}
