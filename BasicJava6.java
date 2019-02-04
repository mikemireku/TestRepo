public class BasicJava6{

	public static boolean isLower(char aChar) {
		return 'a' <= aChar && aChar <= 'z';
	}
	
	public static double conversion(double celsius){
		return (celsius * 9.0 / 5.0) + 32;
	}
	
	public static double geometricSequenceSum(double term, double ratio, int numOfTerms){
		return 0.0;
	}
	
	public static double mantissa(double num){
		double result = num - (int)num;
		return result;
	}
	
	public static char mostFrequentChar(String str){
		return 'a';
	}
}