import java.util.Scanner;

class CountEvenDigits {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int count = 0;

        while (num > 0) {

            int digit = num % 10; 
            System.out.println(digit);  
            if (num % 2 == 0) {  
                count++;
            }

            num = num / 10;     
        }

        System.out.println("Total even digits: " + count);
    }
}
