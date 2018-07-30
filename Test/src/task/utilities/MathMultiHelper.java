package task.utilities;

import java.lang.Math;

public class MathMultiHelper {
	public static int random (int startNumber, int endNumber) {
		int result = 0;
		
		double randomValue = startNumber+Math.random()*(endNumber-startNumber);
		
		float floatRandomValue = Math.round(randomValue);
		int intRanodValue = Math.round(floatRandomValue);
		result = intRanodValue;
		
		return result;
	}

}
