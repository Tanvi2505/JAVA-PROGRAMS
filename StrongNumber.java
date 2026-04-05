import java.util.Scanner;
class StrongNumber{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number:");
		int num=sc.nextInt();
		int sum=0;
		int original=num;
		while(num!=0)
		{
			int last=num%10;
			int fact=1;
			for(int i=1;i<=last;i++)
			{
				fact=fact*i;
			}
			sum=sum+fact;
			num=num/10;
		}
		if(sum==original)
		{
			System.out.println("It is Strong Number");
		}
		else{
			System.out.println("It is not Strong Number");
		}
	}
}