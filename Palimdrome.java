import java.util.Scanner;
class Palimdrome{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number:");
		int num=sc.nextInt();
		int temp=num;
		int rev=0;
		while(temp!=0){
			int last=temp%10;
			rev=rev*10+last;
			temp=temp/10;

		}
		if(num==rev)
		{
			System.out.println("It is Palimdrome");

		}
		else{
			System.out.println("It is not palimdrome");
		}
	}
}