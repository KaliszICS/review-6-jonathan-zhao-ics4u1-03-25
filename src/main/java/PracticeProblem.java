public class PracticeProblem {

	public static void main(String[] args) {

	}
	
	//q1
		public static int sum(int num1, int num2) {
			return num1 + num2;
		}

	
	//q2
public static int difference(int num1, int num2) {
	int result;
	result = num1 - num2;
	return result;

}
	//q3
public static double product(double num1, double num2) {
	double result;
	result = num1 * num2;
	return result;
}

	//q4
	public static String removeFirst(String word) {
		return word.substring(1, word.length());
	}
	//q5

	public static int combinedLength(String str1, String str2) {
		return (str1+str2).length();
	}
	
	//q6

	public static boolean isEven(int num){
		return (num%2 == 0);
	}

	//q7 
	public static boolean isOdd(int num) {
		return (num%2 != 0);
	}
		
	//q8 
	public static boolean isPositive(int num) {
		return (num > 0);
	}

	//q9
	public static boolean isNegative(int num) {
		return (num < 0);
	}
	


}
