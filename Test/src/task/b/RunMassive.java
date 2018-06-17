package task.b;

import task.utilities.*;

public class RunMassive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			int[] arrayExample = new int [MathHelper.random(1, 100)];
						
			for (int i=0; i <= arrayExample.length-1; i ++ ) {
			
				arrayExample[i] = MathHelper.random(10, 1000);
							
				System.out.println(arrayExample[i]);
			
			}
			
			
			

	}

}
