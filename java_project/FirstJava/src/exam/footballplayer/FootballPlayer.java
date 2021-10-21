package exam.footballplayer;
//3.TreeSet<E>을 이용해서 팀 이름순으로 정렬하고 

// 같은 팀의 선수들은 이름 순으로 정렬하고 
// 같은 이름의 선수는 번호 순으로 저장하는 프로그램을 만들어 봅시다.

// 4.축구선수의 번호를 key로 하고
// 축구선수 인스턴스를 저장하는 Map<K,V> 인스턴스를 이용해서 
// 프로그램을 만들어봅시다.
public class FootballPlayer implements Comparable<FootballPlayer> {
	String name;
	int number;
	String team;
	int age;

	public FootballPlayer(String name, int number, String team, int age) {
		this.name = name;
		this.number = number;
		this.team = team;
		this.age = age;
	}

	@Override
	public String toString() {
		return name + "\t" + number + "번\t" + team + "\t" + age + "살";
	}

	@Override
	public boolean equals(Object obj) {
		boolean result = false;

		if (obj != null && obj instanceof FootballPlayer) {
			FootballPlayer fPlayer = (FootballPlayer) obj;
			if (fPlayer.name.equals(this.name) && fPlayer.team.equals(this.team) && fPlayer.age == this.age) {
				result = true;
			}
		}
		return result;
	}

	@Override
	public int hashCode() {
		return this.number % 10;
	}

	@Override
	public int compareTo(FootballPlayer o) {
		int result = this.team.compareTo(o.team);

		if (result == 0) {
			result = this.name.compareTo(o.name);
			if (result == 0) {
				result = this.number - o.number;
			}
		}
		return result;
	}
}
