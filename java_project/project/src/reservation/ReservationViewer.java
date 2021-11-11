package reservation;

public class ReservationViewer {
	public static void main(String[] args) {
		ReservationController rc = new ReservationController();
		
		
		
		
		rc.add();
	
		rc.update();
		rc.add();
		

		rc.showAll();
		rc.delete();
		rc.showAll();
		rc.show();
		
		rc.showNumber();
	}
	
	
	
}
