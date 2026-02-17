import java.util.Scanner;

class CountDigits {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int count = 0;

        if (num == 0) {
            count = 1;
        } else {
            while (num > 0) {
            int digit = num % 10;   
            System.out.println(digit);

                num = num / 10;
                count++;
            }
        }

        System.out.println("Total number of digits: " + count);
    }
}
