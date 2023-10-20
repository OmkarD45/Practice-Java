import java.util.Scanner;

public class ArmstrongNumber {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();
		ArmstrongNumber an=new ArmstrongNumber();
		an.Armstrong(n);
		
	}
	public void Armstrong(int n) {
		int count=0, m=n,k=m,sum=0,remainder;
		while(m>0) {
			m=m/10;
			count++;
		}
		while(n>0) {
			remainder=n%10;
			sum=(int) (sum+Math.pow(remainder,count));
			n=n/10;
		}
		if(k==sum) {
			System.out.println("The given no is armstrong");
		}
		else {
			System.out.println("The given no is NOT armstrong");
		}
		
	}
}
