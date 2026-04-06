import java.util.Scanner;
class Binary{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Binary Number:");
		int num=sc.nextInt();
		int ans=0;
		int zero=1;
		while(num!=0)
		{
			if(num%10==1)
			{
				ans=ans*10+1;
			}
			else{
				zero=zero*10;
			}
			num=num/10;
		}
		ans=ans*zero;
		System.out.println(ans);
	}
}