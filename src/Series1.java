import java.util.Scanner;

public class Series1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the range");
		int n=sc.nextInt();
		int output=0;
		for(int i=1;i<=n;i++) {
			if(i%2==0) {
				output=output-i;
			}
			else {
				output=output+i;
			}
			System.out.println(output);
		}
		System.out.println("The answer of given range is(1-2+3-4....n) :"+output);
	}

}
