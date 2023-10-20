import java.util.Scanner;

public class FactorialRecursion {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the range");
		int n = sc.nextInt();
		System.out.print(factorial(n) + " ");
	}

	private static int factorial(int num) {
		if (num >= 1)
            return num * factorial(num - 1);
        else
            return 1;
	}

}
