package task.b;

import java.util.Arrays;

import task.utilities.MathMultiHelper;

public class CombineFirstNameLastName {
	public static void main(String[] args) {
		String [] arrayFirstName = doGenerateFirstNameArray();
		for(int i=0; i< arrayFirstName.length-1; i++) {
			System.out.println(arrayFirstName[i]);
		}
		String [] arrayLastName = doGenerateLastNameArray();
		for(int i=0; i< arrayLastName.length-1; i++) {
			System.out.println(arrayLastName[i]);
		}	
		String [] arraySecondName = doGenerateSecondNameArray();
		for(int i=0; i< arraySecondName.length-1; i++) {
			System.out.println(arraySecondName[i]);
			}
	}
	private static String[] doGenerateFirstNameArray() {
		String []  firstNameArray= new String[5];
		
		
		firstNameArray[0] = "Macclen";
		firstNameArray[1] = "Loran";
		firstNameArray[2] = "Gotie";
		firstNameArray[3] = "Monro";
		firstNameArray[4] = "Loren";
		
		
		for (int i=0; i <= firstNameArray.length-1; i ++ ){
			
			int index = MathMultiHelper.random(0, firstNameArray.length-1);
			String firstNameArrayItem = firstNameArray[index];
			System.out.println(firstNameArrayItem);
		}
		return firstNameArray;
	}
	
	private static String[] doGenerateLastNameArray() {
		String []  lastNameArray = new String[5];
		
		lastNameArray [0] ="Helen";
		lastNameArray [1] = "Han";
		lastNameArray [2] = "Janet";
		lastNameArray [3] = "Ben";
		lastNameArray [4] = "Luc";

		for (int i=0; i <= lastNameArray.length-1; i ++ ){
			
			int index = MathMultiHelper.random(0, lastNameArray.length-1);
			String lastNameArrayItem = lastNameArray[index];
			System.out.println(lastNameArrayItem);
		}
		return lastNameArray;
	}
	
	private static String[] doGenerateSecondNameArray() {
		String []  secondNameArray = new String [5];
		
		secondNameArray[0] = "Max";
		secondNameArray[1] = "Oli";
		secondNameArray[2] = "Rob";
		secondNameArray[3] = "Mari";
		secondNameArray[4] = "Peter";
	
		 
		for (int i=0; i <= secondNameArray.length-1; i ++ ){
			
			int index = MathMultiHelper.random(0, secondNameArray.length-1);
			String secondNameArrayItem = secondNameArray[index];
			System.out.println(secondNameArrayItem);
		}
		return secondNameArray;
	}
	private static String doCalculateFirstLastSecondName(String [] arrayFirstName,String [] arrayLastName,String [] arraySecondName) {
		
		//3
		StringBuilder processingLog = new StringBuilder();
		
		int randomSumm = 0;		
		int arrayFirstNameLength = arrayFirstName.length-1;
		int arrayLasttNameLength = arrayLastName.length-1;
		int arraySecondtNameLength = arraySecondName.length-1;
		
		int randomArrayIndexFirstNameItem;
		int randomArrayIndexLastNameItem;
		int randomArrayIndexSecondNameItem;
		
	
		for (int i=0; i <=4 ; i ++ ) {
			//Make a single calculation!!!
			randomArrayIndexFirstNameItem = MathHelper.random(0, arrayFirstNameLength);
			randomArrayIndexLastNameItem = MathHelper.random(0, arrayLasttNameLength);
			randomArrayIndexSecondNameItem = MathHelper.random(0, arraySecondtNameLength);
			
			processingLog.append("\nfirst name index: ");
			processingLog.append(randomArrayIndexFirstNameItem);
			processingLog.append("\nlast name index: ");
			processingLog.append(randomArrayIndexLastNameItem);
			processingLog.append("\nsecond name index: ");
			processingLog.append(randomArrayIndexSecondNameItem);
			processingLog.append("\nitem: ");
			//processingLog.append(array2D[randomArrayIndexExternalItem][randomArrayIndexInternalItem]);			
			
			//randomSumm += array2D[randomArrayIndexExternalItem][randomArrayIndexInternalItem];
			/*processingLog.append("\nintermideary amount:");
			processingLog.append(randomSumm);
			processingLog.append("\n");	
		}
		
		processingLog.append("\n\nFinal result:");
		processingLog.append(randomSumm);*/
		}
		

		
		return processingLog.toString();
	}*/	
}
}
