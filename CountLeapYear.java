import java.util.Scanner;
class CountLeapYear{
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the start year");
		int start=sc.nextInt();
		System.out.println("Enter the end year");
		int end=sc.nextInt();
		int count=0;
		for(int tempyear=start;tempyear<=end;tempyear++)
		{
			if(tempyear%4==0&&tempyear%100!=0||tempyear%400==0){
				count++;
			}
		}
		System.out.println(+count);

	}
}