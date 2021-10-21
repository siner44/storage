package exam.footballplayer;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeSet;

public class FootballPlayerMain {
	public static void main(String[] args) {

		ArrayList<FootballPlayer> f = new ArrayList<FootballPlayer>();

		f.add(new FootballPlayer("SIN", 44, "Anyang", 28));
		f.add(new FootballPlayer("PARK", 7, "SEOUL", 33));
		f.add(new FootballPlayer("KIM", 13, "DEAGU", 27));

		System.out.println("이름\t 번호\t 팀\t 나이");
		System.out.println("-------------------------------------------");
		for (int i = 0; i < f.size(); i++) {
			System.out.println(f.get(i));
		}

		System.out.println("-------------------------------------------");

		HashSet<FootballPlayer> f2 = new HashSet<FootballPlayer>();

		f2.add(new FootballPlayer("PARK", 21, "SUWON", 35));
		f2.add(new FootballPlayer("YOON", 7, "SUNGNAM", 21));
		f2.add(new FootballPlayer("PARK", 11, "INCHEON", 25));
		f2.add(new FootballPlayer("KIM", 5, "CHUNGJU", 28));

		Iterator<FootballPlayer> itr = f2.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
		System.out.println("-------------------------------------------");

		TreeSet<FootballPlayer> f3 = new TreeSet<FootballPlayer>();
		f3.add(new FootballPlayer("KIM", 11, "CHUNGJU", 28));
		f3.add(new FootballPlayer("SIN", 7, "CHUNGJU", 30));
		f3.add(new FootballPlayer("JOO", 5, "SEOUL", 25));
		f3.add(new FootballPlayer("PARK", 13, "ANYANG", 19));
		f3.add(new FootballPlayer("SONG", 1, "ANYANG", 23));

		Iterator<FootballPlayer> itr2 = f3.iterator();
		while (itr2.hasNext()) {
			System.out.println(itr2.next());
		}
	
		System.out.println("-------------------------------------------");
	
		Map<Integer, FootballPlayer> f4 = new HashMap<Integer, FootballPlayer>();
		
		f4.put(7, new FootballPlayer("SIN", 11, "ANYANG", 28));
		f4.put(7, new FootballPlayer("KIM", 9, "DEAGU", 23));
		f4.put(7, new FootballPlayer("WOO", 7, "INCHEON", 19));
		f4.put(7, new FootballPlayer("YOON", 4, "SEOUL", 26));
		
		for(Integer i : f4.keySet()) {
			System.out.println(f4.get(i));
		}
	
	}
}
