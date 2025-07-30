package ifffelsee;

public class Pizza {
	public static void main(String args[]) {
		int money=100;
		int price=150;
		
		if(money>price) {
			System.out.println("you can have pizza,take your change back");
		}
		else if(money==price){
			System.out.println("you can have pizza");
		}
		else {
			System.out.println("you can not have pizza");
		}
	}
	

}
