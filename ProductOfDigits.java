import java.util.Scanner;
class ProductOfDigits{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number:");
		int num= sc.nextInt();
		int product=1;
		while(num>0)
			{
				int last=num%10;
				product=product*last;
				num=num/10;

			}
			System.out.println(product);
	}
}