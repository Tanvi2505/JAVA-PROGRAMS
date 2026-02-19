import java.util.Scanner;
class SumProductOfDigits{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number:");
		int num=sc.nextInt();
		int sum=0,product=1;
		while(num>0)
		{
			int last=num%10;
			sum=sum+last;
			product=product*last;
			num=num/10;
		}
		System.out.println(+sum);
		System.out.println(+product);
		if(sum==product)
		{
			System.out.println("Are equal");
		}
		else{
			System.out.println("Not equal");
		}
	}
}