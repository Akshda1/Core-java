package iff.elsee;

public class Pizza {
	public static void main(String args[]) {
		int pizzaprice=150;
		int buyermoney=100;
		
		if(pizzaprice>buyermoney) {
			System.out.println("you have in sufficient money");
		}else if(pizzaprice==buyermoney){
			System.out.println("you can have pizza");
		}else {
			System.out.println("here is your pizza and take remianing money");
		}
	}

}
