package Tasks.A;

public class VisitorsGroup {
	private final int USER_NUMBER_LOW_LIMIT = 5;
	private final int USER_NUMBER_UPPER_LIMIT = 15;
	
	private static String[] usersFirstNames;
	private static String[] usersLastNames;

	
	private void populateFirstNames () {
		usersFirstNames = new String [10];
		usersFirstNames[1]	= "Cathy";
		usersFirstNames[2] = "Monica";
		usersFirstNames[3] = "Piter";
		usersFirstNames[4] = "Rachel";
		usersFirstNames[5] = "Ross";
		usersFirstNames[6] = "Mathew";
		usersFirstNames[7] = "Carl";
		usersFirstNames[8] = "Corthny";
		usersFirstNames[9] = "Jason";
		usersFirstNames[10] = "Jacky";
	}
	
	VisitorsGroup(){
		populateFirstNames();
	}
	//void verifyWhatUserToBeSelectedFirstly() {
		//System.out.println(randomUserOne +Math.random());
	//}
	//void verifyWhatUserToBeSelectedSecondly() {
		//System.out.println(randomUserTwo +Math.random());	
		
	

}