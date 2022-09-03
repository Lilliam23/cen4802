/**
 * 
 * @author lilliamcastro
 *
 */

public class Main {
	
	/**
	 * 
	 * @param string 
	 * @param args
	 * @throws Exception
	 */

public class Main {

	public static void main(String[] args) {

		int n = 10 ;
		
		System.out.println("The "+n+"th term of Fibonacci sequence is "+ fib(n));
	}
	
//recursive static method that returns the nth term in the Fibonacci sequence. 
	/**
	 * 
	 * @return the 10th term of the fibonacci sequence
	 * 
	 */

	public static int  fib(int n) {
		if (n <= 1){
			
			return n;
		
		} else {
			
			return fib(n - 1) + fib(n - 2);
		}
	}

