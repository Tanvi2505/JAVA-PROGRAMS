import java.util.Scanner;

class ExtractDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        System.out.println("Digits are:");

        while (num > 0) {
            int digit = num % 10;   
            System.out.println(digit);
            num = num / 10;        
        }
    }
}
