import java.util.Scanner;

public class StairCaseProblem {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the range");
		int n=sc.nextInt();
		System.out.println(Stair(n));
	}
	public static int Stair(int n) {
		if(n==1||n==2) {
			return n;
		}
		return Stair(n-1)+Stair(n-2);
	}

}
