import java.util.Scanner;
import java.util.ArrayList;


class Bank {
    static String name;
    static String address;
    static long contact;
    static long adarcard;
    static String pancard;
    static double balance;
    static int pin;
    static ArrayList<String> transaction= new ArrayList<String>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        welcomeLoop:
        for ( ; ; ) {
            System.out.println("Welcome");	;
            System.out.println(" Laxmi Chit Fund ");
            System.out.println("1.)CREATE ACCOUNT \n2.)LOGIN IN ");
            System.out.print("Enter the Resp: ");

            int resp = sc.nextInt();

            switch (resp) {
                case 1: {
                    if (name != null) {
                        System.out.println("Account Already Exists");
                        continue;
                    }
                    System.out.println("\n Account Preparation Page : ");
                    System.out.print("NAME: ");
                    name = new Scanner(System.in).nextLine();

                    System.out.print("ADDRESS: ");
                    address = new Scanner(System.in).nextLine();

                    System.out.print("CONATACT: ");
                    contact = new Scanner(System.in).nextLong();

                    System.out.print("ADARCARD: ");
                    adarcard = new Scanner(System.in).nextLong();

                    System.out.print("PANCARD: ");
                    pancard = new Scanner(System.in).next();

                    System.out.print("BALNACE: ");
                    balance = new Scanner(System.in).nextDouble();
                    
                    transaction=add.("Deposit(Creation):"+balance);

                    System.out.print("PIN: ");
                    pin = new Scanner(System.in).nextInt();

                    System.out.println("ACCOUNT CREATED SUCCESSFULLY ");
                    break;
                }
                case 2: {
                    if (name == null) {
                        System.out.println("CREATE YOUR ACCOUNT FIRST");
                        continue;
                    }
                    System.out.println("LOGIN MODULE ");
                    System.out.print("CONATACT: ");
                    long userContact = new Scanner(System.in).nextLong();

                    System.out.print("PIN: ");
                    int userPin = new Scanner(System.in).nextInt();

                    if (contact == userContact && pin == userPin) {
                        System.out.println("LOGIN SUCCESSFULLY");

                        features:
                        for ( ; ; ) {
                            System.out.println("\nFEATURES");
                            System.out.println("1.)DEPOSIT \n2.)WITHDRAWAL \n3.)CHECK BALANCE \n 4.) TRANSACTION \n5.)LOGOUT");
                            System.out.print("ENTER THE OPTION: ");
                            int opt = sc.nextInt();

                            switch (opt) {
                                case 1: {
                                    System.out.println("\n Deposit Amount Module:\n");
                                    System.out.print("Enter Deposit Amount: ");
                                    double deptAmt = new Scanner(System.in).nextDouble();
                                    balance += deptAmt;
                                    transaction.add("DEPOSIT:"+deptAmt);
                                    System.out.println("\n Amount Deposited Successfully");
                                    break;
                                }
                                case 2: {
                                    System.out.println("\n Withdraw Amount Module: \n");
                                    System.out.print("Enter an Amount: ");
                                    double wdrawAmt = new Scanner(System.in).nextDouble();
                                    System.out.print("PIN: ");
                                    int pin2 = new Scanner(System.in).nextInt();
                                    if (pin2 == pin) {
                                        if (wdrawAmt <= balance) {
                                            balance -= wdrawAmt;
                                              transaction.add("WITHDRAW:"+wdrawAmt); 
                                            System.out.println("\n Amount Debited Successfully \n");
                                        } else {
                                            System.out.println("\n INSUFFICIENT FUNDS \n");
                                        }
                                    } else {
                                        System.out.println("\n INVALID PIN \n");
                                    }
                                    break;
                                }
                                case 3: {
                                    System.out.println("\n CHECK BALANCE MODULE \n");
                                    System.out.print("Enter your pin : ");
                                    int pin2 = new Scanner(System.in).nextInt();
                                    if (pin2 == pin) {
                                        System.out.println("Your account balance is : " + balance + " rs.");
                                    } else {
                                        System.out.println("\n INVALID PIN \n");
                                    }
                                    break;
                                }
                                case 4: {
                                    System.out.println("\n *** TRANSACTIONS****\n");
                                    for(String ele:transaction){
                                    System.out.println(ele);
                                }
System.out.println();
break;

                                             }


case 5:{
System.out.println("\n THANK YOU AND VISIT AGAIN \n");
continue welcomeLoop;
}
                default: {
                    System.out.println("\n INVALID RESPONSE \n");
                }
            }
        }
    }
}