import java.util.Scanner;

public class NumberOfDigit {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt(),count = 0;
		while(n>0) {
			n=n/10;
			count++;
		}
		System.out.println("The number of digit in a given number is :"+count);
	}

}
