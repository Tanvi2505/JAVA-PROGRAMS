import java.util.Scanner;
class RangeOfAutomorphic{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Start Number:");
		int start=sc.nextInt();
		System.out.println("Enter a End Number:");
		int end =sc.nextInt();
		for(int num=start;num<=end;num++)
		{
			int pow=1;
			for(int i=num;i!=0;i/=10)
			{
				pow=pow*10;
			}
			int sq = num * num;

            if (sq % pow == num) {
                System.out.println(num);
               }

            }
            }   
		}