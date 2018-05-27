package Tasks.A;

public class Main {

	public static void main(String[] args) {
		Visitor visitor1 = new Visitor();
		Guest guest1 = new Guest();
		
		guest1.handShakeWithVisitor();
		visitor1.handShakeWithGuest();
	}

}
