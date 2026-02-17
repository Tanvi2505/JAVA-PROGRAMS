import java.util.Scanner;
class VowelConsonants{
public static void main(String []args)
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the character:");
char ch =sc.next().charAt(0);
if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='I'||ch=='O'||ch=='U'||ch=='E')
{
System.out.println(ch+" is a vowel");
}
else
{
System.out.println(ch+" is a consonants");
}
}
}