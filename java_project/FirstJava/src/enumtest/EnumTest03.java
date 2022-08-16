package enumtest;

enum Sports{
	BASEBALL,SOCCER,BASKETBALL,GOLF
}

public class EnumTest03 {
	public static void main(String[] args) {
		
		Sports[] sp = Sports.values();
		System.out.println("sp.length : " + sp.length);
		
		for(Sports s : sp) {
			System.out.println(s.ordinal());
		}
		
	}
}
