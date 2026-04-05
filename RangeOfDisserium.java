import java.util.Scanner;
class RangeOfDisserium{
	 public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter start range:");
        int start = sc.nextInt();

        System.out.println("Enter end range:");
        int end = sc.nextInt();
        for(int num=start;num<=end;num++)
        {
        	int temp=num;
        	int ct = 0;
        for (int i = num; i != 0; i /= 10) {
            ct++;
        }

        int sum = 0;

        while (temp != 0) {
            int last = temp % 10;

            int pow = 1;
            for (int i = 0; i < ct; i++) {
                pow = pow * last;
            }

            sum = sum + pow;
            ct--;

            temp = temp / 10;   
        }

        if (sum == num)
        {
        	System.out.println(num);
        }   
        }
}
}