import java.util.Scanner;

public class SumOfAllDigit {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt(),sum = 0,remainder;
		while(n>0) {
			remainder=n%10;
			sum=sum+remainder;
			n=n/10;
		}
		System.out.println("The sum of digit in a given number is :"+sum);
	}
}
