import java.util.Scanner;
class Factors{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number:");
		int num=sc.nextInt();
		int den=1;
		while(den<=num/2)
		{
			if(num%den==0)
			{
			System.out.println(den);
		}
	
		den++;
	}
	System.out.println(num);
	}
}