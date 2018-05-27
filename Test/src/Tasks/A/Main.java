package Tasks.A;

public class Main {

	public static void main(String[] args) {
		visitor visitor1 = new visitor();
		guest guest1 = new guest();
		
		guest1.handShakeWithVisitor();
		visitor1.handShakeWithGuest();
	}

}
