package array;

public class NoteCalculation2 {
	public static void main(String[] args) {
		int money=8737;
		int note[]= {1000,500,100,10,5,1};
		int count=0;
		for(int moneynote:note) {
			count =money/moneynote; //8-1-2-3-1-2
			System.out.println(moneynote+" total note is:"+count);
			money=money%moneynote;
		}
		
		
	}

}
