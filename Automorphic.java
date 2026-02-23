import java.util.Scanner;
class Automorphic{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number:");
		int num=sc.nextInt();
		int pow=1;
		for(int i=num;i!=0;i/=10)
		{
			pow=pow*10;
		}
		int sq=num*num;
		if(sq%pow==num)
		{
			System.out.println("It is automorphic");
		}
		else{
			System.out.println("It is not automorphic");
		}
	}
}