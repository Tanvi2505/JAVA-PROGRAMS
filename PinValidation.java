import java.util.Scanner;
class PinValidation{
	public static void main(String[]args)
	{
	Scanner sc= new Scanner(System.in);
	int storedpin=1234;
	int attempt=0;

	do{
	System.out.println("Enter the Pin:");
    int pin=sc.nextInt();

    if(pin==storedpin)
    {
    System.out.println("Login Successfull");
      break;
        }

        else{
        attempt++;
   System.out.println("Invalid Pin! Attempts left: " + (3 - attempt));

        }
}
        while(attempt<3);
        {
     if(attempt==3){
     System.out.println("Attempts Reached");
     }
        }
	}
}