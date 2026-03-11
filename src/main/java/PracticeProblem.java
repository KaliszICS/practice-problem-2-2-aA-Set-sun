/* Title: More Functions 
	Name: Angie
	Date created: March 11, 2026
	Date updated: March 11, 2026 
	*/

public class PracticeProblem {

	public static void main(String args[]) {
	}

	
	public static boolean isEven(int num) {
			
		boolean even = num % 2 == 0;
		
		return even;
		}

	public static boolean isOdd(int num) {

		boolean odd = num % 2 != 0;
		return odd;

	}

	public static boolean isPositive(int num) {

		boolean posit = num > 0;
		return posit; 

	}

	public static boolean isNegative(int num) {

		boolean negati = num < 0;
		return negati;

	}

	public static String combinedLength(String word, String word2) {

		String combinedWord = word + word2;
		return combinedWord;
	}

}
