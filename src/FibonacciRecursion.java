import java.util.Scanner;

public class FibonacciRecursion {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the range");
		int n=sc.nextInt();
		for(int i=0;i<n;i++) {
			System.out.print(fibonacci(i)+" ");
		}
	}
	public static int fibonacci(int n) {
		if(n==0) {
			return 0;
		}
		if(n==1||n==2) {
			return 1;
		}
		return fibonacci(n-1)+fibonacci(n-2);
	}
}
