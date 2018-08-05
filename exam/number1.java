/*
 * application to calculate the sum of every digit from a^b
 * please check ReadMe.docx for the details
 */

package exam;

public class number1 {
	
	public static int sumOfDigit(String pow_result) {
		int sum = 0;
		String digitPrint = "";
		for(int i=0; i < pow_result.length(); i++)
		{
			sum += (pow_result.charAt(i) - '0');
			digitPrint += (pow_result.charAt(i) - '0');
			if(i != pow_result.length() - 1) digitPrint += "+";
		}
		System.out.println(digitPrint + "=" + sum);
		return sum;
	}
	
	public static String exponent(int a, int b) {
		int a_pow_b = (int)Math.pow(a, b);
		return Integer.toString(a_pow_b);
	}
	
	public static void process(int a, int b) {
		//exponent process
		String pow_result = exponent(a, b);
		System.out.println(a + "^" + b + "=" + pow_result);
		//sum every digit process
		int sum_result = sumOfDigit(pow_result);
		System.out.println("Sum of every digit is " + sum_result);
	}
	
	public static void main(String[] args) {
		int a = 2;
		int b = 20;
		process(a, b);
	}
}
