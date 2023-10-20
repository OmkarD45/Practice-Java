import java.util.Scanner;

public class EvenNumberRange {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the range");
		int n=sc.nextInt();
		System.out.println("The even numbers of given range are :");
		for(int i=0;i<=n;i++) {
			if(i%2==0) {
				System.out.print(i+" ");
			}
		}
		
	}
}
