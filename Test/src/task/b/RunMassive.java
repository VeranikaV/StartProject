package task.b;

import task.utilities.*;

public class RunMassive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			int[] arrayExample = new int [5];
			arrayExample[0] = 1;
			arrayExample[1] = 45;
			arrayExample[2] = 23;
			arrayExample[3] = 68;
			arrayExample[4] = 6;
						
			
			for (int i=0; i < 1000; i ++ ) {
			
				System.out.println(MathHelper.random(5, 49));
			}
			
			
			

	}

}
