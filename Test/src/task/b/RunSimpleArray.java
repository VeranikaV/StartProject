package task.b;

import task.utilities.*;

public class RunSimpleArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//1	
		int[] arrayExample = new int [MathHelper.random(5, 15)];
		
		//2
		for (int i=0; i <= arrayExample.length-1; i ++ ) {
			arrayExample[i] = MathHelper.random(100, 999);
		}
							
		//3
		int randomSumm = 0;
		for (int i=0; i <=4 ; i ++ ) {
			//3.2 Grab item and increment with that	
			int randomArrayItemIndex = MathHelper.random(0, arrayExample.length-1);
			System.out.println("Ёлемент номер " + randomArrayItemIndex + " - " + arrayExample[randomArrayItemIndex] );
			
			randomSumm += arrayExample[randomArrayItemIndex];			
		}
		System.out.println(randomSumm);
	}				
}