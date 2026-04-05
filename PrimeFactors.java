import java.util.Scanner;
class PrimeFactors{
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a Number:");
		int num=sc.nextInt();
		int start=2;
		while(start<=num){
			int den=2;
			while(den<start)
			{
               if(start%den==0)
               {
               	break;
               }
               den++;
			}
			if(den==start)
			{
				if(num%start==0)
				{
					System.out.println(start);
				}
				
			}
			start++;
		}
	}
}