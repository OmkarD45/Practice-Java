import java.util.Scanner;

public class SimpleArraySum {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no of elements you want to enter in the array");
		int n=sc.nextInt();
		int sum=0;
		System.out.println("Enter the array elements");
		int[] arr = new int[n];
		for (int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		for (int i=0;i<n;i++) {
			sum+=arr[i];
		}
		System.out.println("The sum of array is :"+sum);
	}
}
