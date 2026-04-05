import java.util.Scanner;
class Armstrong{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Number:");
		int num=sc.nextInt();
		int ct=0;
		for(int i =num;i!=0;i/=10)
		{
			ct++;
		}
		int sum=0;
		for(int i =num;i!=0;i/=10)
		{
			int last=i%10;
			int pow=1;
			for(int j=0;j<ct;j++)
			{
				pow=pow*last;
			}
			sum=sum+pow;
		}
		if(sum==num)
		{
			System.out.println("It is Armstrong Number");
		}
		else{
			System.out.println("It is Not Armstrong Number");
		}
	}
}