package task.a;

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
	
	private void populateLastNames () {
		usersLastNames = new String [10];
		usersLastNames[1] = "Calkin";
		usersLastNames[2] = "Riters";
		usersLastNames[3] = "Hoccing";
		usersLastNames[4] = "Gracham";
		usersLastNames[5] = "Rogister";
		usersLastNames[6] = "Duglas";
		usersLastNames[7] = "Farrel";
		usersLastNames[8] = "Luis";
		usersLastNames[9] = "Jasons";
		usersLastNames[10] = "Ravera";
	
		
	}
	
	public void VisitorsGroupLasttName(){
		populateLastNames();
	}
	
	public int getIndexRandomLastNames(String populateLastNames) {
		
		int indexRandomLastName = (int)(Math.random()*usersLastNames.length);
		
	    return indexRandomLastName;
	     
		
	}
	
	
	
}