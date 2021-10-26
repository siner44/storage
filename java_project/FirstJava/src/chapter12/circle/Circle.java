package chapter12.circle;

import java.io.Serializable;

// Serializable 인터페이스 구현은 -> 직렬화의 대상 -> 객체 저장 -> 인스턴스 변수들을 저장
public class Circle implements Serializable {
	
	int xPos;
	int yPos;
	transient double rad;
	
	public Circle(int xPos, int yPos, double rad) {
		super();
		this.xPos = xPos;
		this.yPos = yPos;
		this.rad = rad;
	}
	
	public void showCircleInfo() {
		System.out.printf("[%d,%d]\n", xPos, yPos);
		System.out.println("rad : " + rad);
	}
	
}
