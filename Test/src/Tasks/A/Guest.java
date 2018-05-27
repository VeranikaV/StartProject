package Tasks.A;

public class Guest {
	
	private int age;
	private String lastName;
	private String firstName;
	
	public Guest (String firstName, String lastName) {
		setFirstName(firstName);
		setLastName(lastName);
	}
	
	void handShakeWithVisitor(){
		System.out.println("Hi dear, \nnice to see you. I am a new guest here.");
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	private int getAge() {
		return age;
	}

	private void setAge(int age) {
		this.age = age;
	}
}