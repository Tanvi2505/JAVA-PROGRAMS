import java.util.Scanner;

class CurrencyConvertor
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Amount in INR: ");
        double amount = sc.nextDouble();

        System.out.println(
            "1.) USD\n" +
            "2.) EUR\n" +
            "3.) KWD\n" +
            "4.) GBP\n" +
            "5.) AUD\n" +
            "6.) CAD\n" +
            "7.) SGD\n" +
            "8.) JPY\n" +
            "9.) CHF\n" +
            "10.) AED"
        );

        System.out.println("Enter the Currency Code: ");
        String resp = sc.next().toUpperCase();

        boolean valid = true;
        double convertedAmount = 0;

        if (resp.equals("USD")) {
            convertedAmount = amount / 90.21;
        } 
        else if (resp.equals("EUR")) {
            convertedAmount = amount / 106.53;
        } 
        else if (resp.equals("KWD")) {
            convertedAmount = amount / 293.61;
        } 
        else if (resp.equals("GBP")) {
            convertedAmount = amount / 114.20;
        } 
        else if (resp.equals("AUD")) {
            convertedAmount = amount / 59.80;
        } 
        else if (resp.equals("CAD")) {
            convertedAmount = amount / 67.10;
        } 
        else if (resp.equals("SGD")) {
            convertedAmount = amount / 66.90;
        } 
        else if (resp.equals("JPY")) {
            convertedAmount = amount / 0.61;
        } 
        else if (resp.equals("CHF")) {
            convertedAmount = amount / 112.40;
        } 
        else if (resp.equals("AED")) {
            convertedAmount = amount / 24.55;
        } 
        else {
            valid = false;
            System.out.println("\n? Invalid Currency Code\n");
        }

        if (valid) {
            System.out.printf("%.2f INR = %.2f %s", amount, convertedAmount, resp);
        }
    }
}
