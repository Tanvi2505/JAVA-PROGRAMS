import java.util.Scanner;
class ExtractFibonacci{
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a number:");
		int num=sc.nextInt();
		while(num>0){
			int last=num%10;
		    if(last==0||last==1||last==2||last==3||last==5||last==8)
		    {
		    	System.out.println(last);
		    }
		    num=num/10;
		}
	}
}

