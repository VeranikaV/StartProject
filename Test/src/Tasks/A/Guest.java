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
	
	void handShakeWithVisitor1(){
		System.out.println("My name is "+ firstName + " and I am " + age + " years old");
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

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
}