public class BasicJava1 {
	
	// First method documentation
	public static boolean isLower(char aChar) {
		return 'a' <= aChar && aChar <= 'z';
	}
	
	public static int indexOfFirstLowerCaseChar(String str){
		return -1;
	}
	
	public static long ceilingAfterMult(int num1, double num2){
		long result1 = 0;
		double result = num1 * num2;	
		if ((result - (long)result) >= 0.5)
			result1 = (long)result + 1;
		else
			result1 = (long)result;
	
		return result1;
	}
	
	public static int addOctalDigits(int fiveOctalDigitNum){
		int added = 0;
		int rest = fiveOctalDigitNum;
		added += rest%8;
		rest = rest/8;
		
		added += rest%8;
		rest = rest/8;
		
		added += rest%8;
		rest = rest/8;
		
		added += rest%8;
		rest = rest/8;
		
		added += rest%8;
		
		return added;
	}
	
}
	