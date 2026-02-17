import java.util.Scanner;
class Cyclinder{
public static void main(String[]args)
{
Scanner sc = new Scanner(System.in);
System.out.println("Enter a radius (cm):");
double radius=sc.nextDouble();
System.out.println("Enter a height (cm) :");
double height=sc.nextDouble();
final double PI=22/7.0;
final double AREA = PI*radius*radius;
final double VOLUME= AREA*height;
System.out.println("radius:"+radius+"cm");
System.out.printf("AREA of Cyclinder :%.3f cm^2 %n",AREA);
System.out.printf("VOLUME of Cyclinder :%.3f cm^3",VOLUME);
}
}