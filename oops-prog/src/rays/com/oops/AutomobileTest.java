package rays.com.oops;

public class AutomobileTest {
	public static void main(String[] args) {
	
	Automobile car1=new Automobile();
	Automobile car2=new Automobile();
	car1.setCompany("ford");
	car1.setModel("suv:123abc");
	car1.setColour("seablue");
	car1.setSpeedlimit(150);
	
	System.out.println(car1.getCompany());
	System.out.println(car1.getModel());
	System.out.println(car1.getColour());
	System.out.println(car1.getSpeedlimit());
	System.out.println("--------------------");
	
	car2.setCompany("tata");
	car2.setModel("nexon:ev");
	car2.setColour("white");
	car2.setSpeedlimit(120);
	
	System.out.println(car2.getCompany());
	System.out.println(car2.getModel());
	System.out.println(car2.getColour());
	System.out.println(car2.getSpeedlimit());
	}
}
