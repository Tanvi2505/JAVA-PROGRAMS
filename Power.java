import java.util.Scanner;
class Power{
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a number");
		int num=sc.nextInt();
        System.out.println("Enter a raise");
        int raise=sc.nextInt();
        int res=1;
        for(int i=0;i<raise;i++)
        {
        	res=res*num;
        }
        System.out.println(res);





			}
}