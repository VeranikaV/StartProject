package task.b;

import java.util.Arrays;

import task.utilities.MathHelper;
import task.utilities.MathMultiHelper;

public class RunMultiDimensionalArray {

	public static void main(String[] args) {
		/*int [][] array2D = doGenerate2DArray();
		for(int i=0; i< array2D.length-1; i++) {
			System.out.println(Arrays.toString(array2D[i]));
		}
		
		String calculationsLog = doCalculateSumFrom2DArray(array2D);
		
		System.out.println(calculationsLog);
	}
	
	/***
	 * Method generates and populates 2-dimensional array. Limits for dimensional: 1st is between 5 and 15, second is between 2 and 30.
	 * @return int[][]
	 */
	/*private static int[][] doGenerate2DArray() {
		//1
		
		int[][] multiArrayExample = new int [MathMultiHelper.random(5, 15)][MathMultiHelper.random(2, 30)];
		
		//2
	
		for (int i=0; i <= multiArrayExample.length-1; i ++ ) {
			
			for (int j=0; j <= multiArrayExample[i].length-1; j ++) {
									
					multiArrayExample[i][j] = MathMultiHelper.random(100, 999);
				
			}
			
		}
		return multiArrayExample;
	}
	
	/***
	 * Method conduct the following calculations: randomly grabs 5 items and calculates their sum.
	 * @param array2D
	 * @return String
	 */
	/*private static String doCalculateSumFrom2DArray(int[][] array2D) {
		
		//3
		StringBuilder processingLog = new StringBuilder();
		
		int randomSumm = 0;		
		int firstDimensionLength = array2D.length-1;
		int secondDimensionLength = array2D[0].length-1;
		
		int randomArrayIndexExternalItem;
		int randomArrayIndexInternalItem;
		
	
		for (int i=0; i <=4 ; i ++ ) {
			//Make a single calculation!!!
			randomArrayIndexExternalItem = MathHelper.random(0, firstDimensionLength);
			randomArrayIndexInternalItem = MathHelper.random(0, secondDimensionLength);
			processingLog.append("\nfirst dimension index: ");
			processingLog.append(randomArrayIndexExternalItem);
			processingLog.append("\nsecond dimension index: ");
			processingLog.append(randomArrayIndexInternalItem);
			processingLog.append("\nitem: ");
			processingLog.append(array2D[randomArrayIndexExternalItem][randomArrayIndexInternalItem]);			
			
			randomSumm += array2D[randomArrayIndexExternalItem][randomArrayIndexInternalItem];
			processingLog.append("\nintermideary amount:");
			processingLog.append(randomSumm);
			processingLog.append("\n");	
		}
		
		processingLog.append("\n\nFinal result:");
		processingLog.append(randomSumm);
		
		
		return processingLog.toString();
	}*/	
		int [][][][] array4D = doGenerate4DArray();
			for (int i =0; i <array4D.length-1; i++) {
				System.out.println(Arrays.deepToString(array4D[i]));
					
			}
			String calculationsLog = doCalculateSumFrom4DArray(array4D);
			
			System.out.println(calculationsLog);
	}
	private static int[][][][] doGenerate4DArray(){
		int[][][][] multiArrayExample = new int [MathMultiHelper.random(5, 15)][MathMultiHelper.random(2, 30)][MathMultiHelper.random(1, 5)][MathMultiHelper.random(4, 9)];
		
		//2
	
		for (int i=0; i <= multiArrayExample.length-1; i ++ ) {
			
			for (int j=0; j <= multiArrayExample[i].length-1; j ++) {
				
				for (int k=0; k <= multiArrayExample[i][j].length-1; k ++) {
					
					for (int m=0; m <= multiArrayExample[i][j][k].length-1; m ++) {
						
						multiArrayExample[i][j][k][m] = MathMultiHelper.random(100, 999);
				}
									
					
				}
			}
			
		}
		
		return multiArrayExample;
		
	}
	
	private static String doCalculateSumFrom4DArray(int[][][][] array4D) {
		
		StringBuilder processingLog = new StringBuilder();
		
		int randomSumm = 0;		
		int firstDimensionLength = array4D.length-1;
		int secondDimensionLength = array4D[0].length-1;
		int thirdDimensionLength = array4D[0][0].length-1;
		int fourthDimensionLength = array4D[0][0][0].length-1;
		
		
		int randomArrayFirstOrderIndexItem;
		int randomArraySecondOrderIndexItem;
		int randomArrayThirdOrderIndexItem;
		int randomArrayFourthOrderIndexItem;
		
	
		for (int i=0; i <=4 ; i ++ ) {
			//Make a single calculation!!!
			randomArrayFirstOrderIndexItem = MathHelper.random(0, firstDimensionLength);
			randomArraySecondOrderIndexItem = MathHelper.random(0, secondDimensionLength);
			randomArrayThirdOrderIndexItem = MathHelper.random(0, thirdDimensionLength);
			randomArrayFourthOrderIndexItem = MathHelper.random(0, fourthDimensionLength);
			processingLog.append("\nfirst dimension index: ");
			processingLog.append(randomArrayFirstOrderIndexItem);
			processingLog.append("\nsecond dimension index: ");
			processingLog.append(randomArraySecondOrderIndexItem);
			processingLog.append("\nthird dimension index: ");
			processingLog.append(randomArrayThirdOrderIndexItem);
			processingLog.append("\nfourth dimension index: ");
			processingLog.append(randomArrayFourthOrderIndexItem);
			processingLog.append("\nitem: ");
			processingLog.append(array4D[randomArrayFirstOrderIndexItem][randomArraySecondOrderIndexItem][randomArrayThirdOrderIndexItem][randomArrayFourthOrderIndexItem]);			
			
			randomSumm += array4D[randomArrayFirstOrderIndexItem][randomArraySecondOrderIndexItem][randomArrayThirdOrderIndexItem][randomArrayFourthOrderIndexItem];
			processingLog.append("\nintermideary amount:");
			processingLog.append(randomSumm);
			processingLog.append("\n");	
		}
		
		processingLog.append("\n\nFinal result:");
		processingLog.append(randomSumm);
		
		
		return processingLog.toString();
		
	}
}

