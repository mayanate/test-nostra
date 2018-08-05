/*
 * application to calculate the sum of the natural number below n that are multiples of 3 or 5
 * please check ReadMe.docx for the details
 */

package exam;

public class number3 {
	
	public static void process(int n) {
		int sum = 0;
		String digitPrint = "";
		for(int i = 1; i < n; i++)
		{
			if(i%3==0 || i%5==0)
			{
				if(digitPrint != "") digitPrint += "+";
				sum += i;
				digitPrint += i;
			}
		}
		System.out.println(digitPrint + "=" + sum);
	}
	
	public static void main(String[] args) {
		int n = 20;
		System.out.println("Natural number below " + n + " that are multiples 3 or 5");
		process(n);			
	}
}
