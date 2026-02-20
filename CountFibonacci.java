import java.util.Scanner;
class CountFibonacci{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a start number");
		int start=sc.nextInt();
		System.out.println("Enter a end number");
		int end=sc.nextInt();
		int n1=0,n2=1,ans;
		int count=0;
		while(n1<=end)
		{
			ans=n1+n2;
			if(n1>=start)
			{
				System.out.println(n1);
				count++;

			}
			n1=n2;
			n2=ans;
		}
		System.out.println("Total Count is : "  +count);

	}
}