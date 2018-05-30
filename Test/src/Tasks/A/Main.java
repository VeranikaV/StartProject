package Tasks.A;

public class Main {

	public static void main(String[] args) {
		Visitor visitor = new Visitor();
		Guest guest = new Guest("John", "Whool");
		
		guest.handShakeWithVisitor();
		visitor.handShakeWithGuest();
		guest.setAge(35);
		guest.doInformPersonalData();
	}

}
