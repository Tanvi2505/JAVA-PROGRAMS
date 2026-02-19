import java.util.Scanner;

class Reverse {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int num = sc.nextInt();

        int original = num;   
        int rev = 0;

        num = Math.abs(num);  

        while (num != 0) {
            int last = num % 10;
            rev = rev * 10 + last;
            num = num / 10;
        }

        if (original < 0) {
            rev = -rev;   
        }

        System.out.println("Reversed number: " + rev);

      }
}
