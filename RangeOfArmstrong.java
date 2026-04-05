import java.util.Scanner;

class RangeOfArmstrong {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter start range:");
        int start = sc.nextInt();

        System.out.println("Enter end range:");
        int end = sc.nextInt();

        for (int num = start; num <= end; num++) {

            int temp = num;

            int ct = 0;
            for (int i = num; i != 0; i /= 10) {
                ct++;
            }

            int sum = 0;
            for (int i = num; i != 0; i /= 10) {
                int last = i % 10;

                int pow = 1;
                for (int j = 0; j < ct; j++) {
                    pow = pow * last;
                }

                sum = sum + pow;
            }

            if (sum == num) {
                System.out.println(num);
            }
        }
    }
}