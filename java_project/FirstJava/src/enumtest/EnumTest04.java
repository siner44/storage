package enumtest;

enum Sports2{
	BASEBALL(4),SOCCER(13),BASKETBALL(3),GOLF(41);
	
	private final int var;
	
	Sports2(int v){
		var = v;
	}
	
	public int getvar() {
		return var;
	}
	
}

public class EnumTest04 {
	public static void main(String[] args) {
		System.out.println(Sports2.BASEBALL);
		System.out.println(Sports2.SOCCER);
		System.out.println(Sports2.BASKETBALL);
		System.out.println(Sports2.GOLF);
		System.out.println();
		for(Sports2 s : Sports2.values()) {
			System.out.println(s + " : " + s.getvar());
		}
	}
}
