package task.b;

import java.util.Arrays;

import task.utilities.MathHelper;

import task.utilities.MathMultiHelper;

public class CombineFirstNameLastName {
	private static final int NUMBER_FIRST_NAME_GENERATED = 10;
	private static final int NUMBER_PATRONYMIC_GENERATED = 8;
	private static final int NUMBER_LAST_NAME_GENERATED = 7;
	private static final int NUMBER_PEOPLE_GENERATED = 4;
	public static void main(String[] args) {
		String [] arrayFirstName = doGenerateFirstNameArray();		
		String [] arrayLastName = doGenerateLastNameArray();		
		String [] arrayPatronymic = doGeneratePatronymicArray();
		
		String generatePersonIdentity = doGeneatePersonIdentity(arrayFirstName,arrayLastName,arrayPatronymic);		 
		System.out.println(generatePersonIdentity);		
	}
	private static String[] doGenerateFirstNameArray() {
		//TODO: Number of first names should be 10
		String []  firstNameArray= new String[NUMBER_FIRST_NAME_GENERATED];
		
		firstNameArray[0] = "Macclen";
		firstNameArray[1] = "Loran";
		firstNameArray[2] = "Gotie";
		firstNameArray[3] = "Monro";
		firstNameArray[4] = "Savage";
		firstNameArray[5] = "Shanel";
		firstNameArray[6] = "Petro";
		firstNameArray[7] = "Someonenew";
		firstNameArray[8] = "Newname";
		firstNameArray[9] = "Putin";
					
		return firstNameArray;
	}
	
	private static String[] doGenerateLastNameArray() {
		//TODO: Number of last names should be 7
		String []  lastNameArray = new String[NUMBER_LAST_NAME_GENERATED];
		
		lastNameArray [0] ="Helen";
		lastNameArray [1] = "Han";
		lastNameArray [2] = "Janet";
		lastNameArray [3] = "Ben";
		lastNameArray [4] = "Nino";
		lastNameArray [5] = "Vanessa";
		lastNameArray [6] = "Jan";
				
		return lastNameArray;
	}
	
	private static String[] doGeneratePatronymicArray() {
		//TODO: Number of patronymics should be 8
		String []  patronymicsArray = new String [NUMBER_PATRONYMIC_GENERATED];
		
		patronymicsArray[0] = "Max";
		patronymicsArray[1] = "Oli";
		patronymicsArray[2] = "Rob";
		patronymicsArray[3] = "Mari";
		patronymicsArray[4] = "Peter";
		patronymicsArray[5] = "Oliver";
		patronymicsArray[6] = "Susan";
		patronymicsArray[7] = "Piter";
	
		 return patronymicsArray;
	}
	private static String doGeneatePersonIdentity(String [] arrayFirstName,String [] arrayLastName,String [] arrayPatronymic) {
		
		//3
		StringBuilder personsIdentity = new StringBuilder();
		
		int arrayFirstNameLength = arrayFirstName.length-1;
		int arrayLastNameLength = arrayLastName.length-1;
		int arrayPatronymicLength = arrayPatronymic.length-1;
		
		int firstNameRandomIndex;
		int lastNameRandomIndex;
		int patronymicRandomIndex;
	
		//TODO: answer the question: why does Eclipse pay your attention to 3 lines below?
		//TODO: because of that's unused, what will happen with the lines after build?
		//HINT: code elimination optimization on Java VM, google it
		String firstNameRandomItem;
		String lastNameRandomItem;
		String patronymicRandomItem;
	
	
		for (int i=0; i <= NUMBER_PEOPLE_GENERATED ; i ++ ) {
			
			
			//Generate random number in frames of firstNames array
			firstNameRandomIndex = MathHelper.random(0, arrayFirstNameLength);
			//Get randomly first name
			firstNameRandomItem = arrayFirstName[firstNameRandomIndex];
			//TODO: retrieve correctly last name and patronymic making comment for each code line 
			lastNameRandomIndex = MathHelper.random(0, arrayLastNameLength);
			//Get randomly last name
			lastNameRandomItem = arrayLastName[lastNameRandomIndex];
			patronymicRandomIndex = MathHelper.random(0, arrayPatronymicLength);	
			//Get randomly patronumic
			patronymicRandomItem = arrayPatronymic[patronymicRandomIndex];
			personsIdentity.append(firstNameRandomItem);
			personsIdentity.append(lastNameRandomItem);
			personsIdentity.append(patronymicRandomItem);
			personsIdentity.append("\n");
			
								
		}
		
		return personsIdentity.toString();
	}
}
	

