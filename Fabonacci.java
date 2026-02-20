import java.util.Scanner;
class Fabonacci{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Number:");
		int n= sc.nextInt();
		int n1=0,n2=1,ans;
		for(int i=0;i<n;i++)
		{
			ans=n1+n2;
			System.out.println(n1);
		
		n1=n2;
		n2=ans;
	}
}
}