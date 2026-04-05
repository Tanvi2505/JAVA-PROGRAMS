import java.util.Scanner;
class RangeOfUgly{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Start Number:");
		int start=sc.nextInt();
		System.out.println("Enter a End Number:");
		int end =sc.nextInt();
		for(int i=start;i<=end;i++)
		{
		     int num=i;
		     while(num%2==0)
		     {
		     	num=num/2;
		     }	
		     while(num%3==0)
		     {
		     	num=num/3;
		     }
		     while(num%5==0)
		     {
		     	num=num/5;
		     }
		     if(num==1)
		     {
		     	System.out.println(i);
		     }
		}
	}
}
