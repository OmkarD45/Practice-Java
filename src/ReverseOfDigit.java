import java.util.Scanner;

public class ReverseOfDigit {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt(),rev=0,rem;
		while(n>0) {
			rem=n%10;
			rev=rev*10+rem;
			n=n/10;
		}
		System.out.println("The number of digit in a given number is :"+rev);
	}
}
