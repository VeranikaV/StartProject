package task.a;

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
	
	void doInformPersonalData() {
		System.out.println("Oh, I am "+getFirstName()+". And I am "+getAge()+" years old.");
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