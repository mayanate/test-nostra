/*
 * application to get smallest number that can be devided from 1 to n
 * please check ReadMe.docx for the details
 */

package exam;

public class number2 {
	
	private static int gcd(int a, int b)
	{
	    while (b != 0)
	    {
	        int temp = b;
	        b = a % b;
	        a = temp;
	    }
	    return a;
	}

	private static int lcm(int a, int b)
	{
		int lcm_result = (a * b) / gcd(a, b);
		//System.out.println("Smallest number that can be devided by " + a + " and " + b + " is " + lcm_result);
	    return lcm_result;
	}

	private static void process(int n)
	{
	    int value = 1;
	    for(int i = 1; i < n; i++)
	    {
	    	value = lcm(value, i+1);
	    }
		System.out.println("So, the smallest number that can be devided from 1 to " + n + " is " + value);
	}
	
	public static void main(String[] args) {
		int n = 15;
		process(n);
	}
	
}
