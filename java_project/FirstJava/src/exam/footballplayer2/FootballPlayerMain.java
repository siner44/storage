package exam.footballplayer2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

import exam.footballplayer.FootballPlayer;

public class FootballPlayerMain {
	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		ArrayList<FootballPlayer> f = new ArrayList<FootballPlayer>();

		f.add(new FootballPlayer("SIN", 44, "Anyang", 28));
		f.add(new FootballPlayer("PARK", 7, "SEOUL", 33));
		f.add(new FootballPlayer("KIM", 13, "DEAGU", 27));

		System.out.println("이름\t 번호\t 팀\t 나이");
		System.out.println("-------------------------------------------");
		for (int i = 0; i < f.size(); i++) {
			System.out.println(f.get(i));
		}
		
		ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("FootballPlayer"));
		out.writeObject(f.get(1));
		out.writeObject(f.get(2));
		out.writeObject(f.get(3));
		out.close();
		
		ObjectInputStream in = new ObjectInputStream(new FileInputStream("FootballPlayer"));
		FootballPlayer f1 = (FootballPlayer)in.readObject();
		FootballPlayer f2 = (FootballPlayer)in.readObject();
		String message = (String)in.readObject();
		in.close();
		
		f1.toString();
		f2.toString();
		System.out.println(message);
	}
}
