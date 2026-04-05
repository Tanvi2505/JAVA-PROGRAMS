import java.util.Scanner;
class RangeOfReverse{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Start Number:");
		int start=sc.nextInt();
		System.out.println("Enter a End Number:");
		int end =sc.nextInt();
		for(int i=end;i>=start;i--)
		{
			int num=i;
			int reverse=0;
			while(num!=0)
			{
				int last=num%10;
				reverse=reverse*10+last;
				num=num/10;
			}
			System.out.println(i);
		}


	}
}