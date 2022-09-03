

public class Main {
	

	public static void main(String[] args) {

		int n = 10 ;
		
		System.out.println("The "+n+"th term of Fibonacci sequence is "+ fib(n));
	}
	

	public static int  fib(int n) {
		if (n <= 1){
			
			return n;
		
		} else {
			
			return fib(n - 1) + fib(n - 2);
		}
	}
}