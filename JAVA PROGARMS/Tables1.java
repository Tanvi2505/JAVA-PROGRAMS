import java.util.Scanner;
class Tables1{
public static void main(String[]args)
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the number:");
int num=sc.nextInt();
for(int i=1;i<=10;num*i)
{
System.out.println(num + " X " + i + " = " + (num * i));
}
}
}
