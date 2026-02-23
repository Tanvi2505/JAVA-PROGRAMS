import java.util.Scanner;
class CountPronic{
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a start number:");
		int start=sc.nextInt();
		System.out.println("Enter a end number:");
		int end=sc.nextInt();
		int count=0;
		for(int i=0;i*(i+1)<=end;i++)
		{
			if(i*(i+1)>=start)
			{
				System.out.println(i*(i+1));
				count++;

				}
					}
		System.out.println(" The total count is " +count);
	}
}