import java.util.Scanner;

class Disserium {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number:");
        int num = sc.nextInt();

        int original = num;  

        int ct = 0;
        for (int i = num; i != 0; i /= 10) {
            ct++;
        }

        int sum = 0;

        while (num != 0) {
            int last = num % 10;

            int pow = 1;
            for (int i = 0; i < ct; i++) {
                pow = pow * last;
            }

            sum = sum + pow;
            ct--;

            num = num / 10;   
        }

        if (sum == original)   
        {
            System.out.println("It is Disserium Number");
        } else {
            System.out.println("It is not Disserium Number");
        }
    }
}