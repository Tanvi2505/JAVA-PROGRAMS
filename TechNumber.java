import java.util.Scanner;
class TechNumber{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number:");
		int num=sc.nextInt();
		int ct=0;
		for(int i=num;i!=0;i/=10)
		{
			ct++;
		}
		if(ct%2==0)
		{
			int pow=1;
			for(int i=0;i<ct/2;i++)
			{
				pow=pow*10;
			}
			int lasthalf=num%pow;
			int firsthalf=num/pow;
			int total= firsthalf+lasthalf;
			if(total*total==num)
			{
				System.out.println("It is TechNumber");
			}
			else{
				System.out.println("It is not TechNumber");
			}
		}
	}
}