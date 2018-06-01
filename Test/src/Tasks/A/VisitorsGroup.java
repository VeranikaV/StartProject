package Tasks.A;

public class VisitorsGroup {
	private final int randomUserOne = 5;
	private final int randomUserTwo = 15;
	
	String [] randomUser = new String [15];
	randomUser[4] = "Bill";
	randomUser[5] = "Cathy";
	randomUser[6] = "Monica";
	randomUser[7] = "Piter";
	randomUser[8] = "Rachel";
	randomUser[9] = "Ross";
	randomUser[10] = "Mathew";
	randomUser[11] = "Carl";
	randomUser[12] = "Corthny";
	randomUser[13] = "Jason";
	randomUser[14] = "Jacky";
	
	for(i = 0; i < 15; i++) {
		if(i>= randomUser[4])
			System.out.println(randomUserOne +Math.random());;
		
	}
	
	//void verifyWhatUserToBeSelectedFirstly() {
		//System.out.println(randomUserOne +Math.random());
	//}
	//void verifyWhatUserToBeSelectedSecondly() {
		//System.out.println(randomUserTwo +Math.random());	
		
	}

}