import java.util.Scanner;
class Evm{
static int cong,bjp,aap,mns,nota;
public static void main(String[]args)
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the population of area:");
int population= sc.nextInt();

for(int i=1;i<=population;i++)
{
System.out.println("\n ****WELCOME****");
System.out.println("APKA EK VOTE DESH BADAL NAHI SAKTA HAI ");
System.out.println("1.BJP \n 2. AAP \n 3. CONG \n 4. MNS \n 5. NOTA \n ");
System.out.println(" Enter your response:");
String resp=sc.next().toUpperCase();

if(resp.equals("CONG")){
cong++;
System.out.println("You have voted for CONG");
System.out.println("Bharat Jodo");
}

else if(resp.equals("AAP")){
aap++;
System.out.println("You have voted for AAP");
System.out.println("APKA VOTE MUJE AZAD KAR SAKTA HAI");
}

else if(resp.equals("BJP")){
bjp++;
System.out.println("You have voted for bjp");
System.out.println("ACCHE DIN AYENGE");
}

else if(resp.equals("MNS")){
mns++;
System.out.println("You have voted for MNS");
System.out.println("Jai Maharastra");
}

else if(resp.equals("NOTA")){
nota++;
System.out.println("You have voted for NOTA");
System.out.println("U R EDUCATED");
}

else{

System.out.println("Invalid Response");
i--;
}

System.out.println("cong" +cong);
System.out.println("bjp" +bjp);
System.out.println("aap" +aap);
System.out.println("mns" +mns);
System.out.println("nota" +nota);

if(bjp>=cong && bjp>=mns && bjp>=aap && bjp>=nota){
System.out.println("BJP has won the elections by "+bjp +"votes");
}

else if(cong>=bjp && cong>=mns && cong>=aap && cong>=nota){
System.out.println("Cong has won the elections by "+cong +"votes");
}
else if (mns>=cong && mns>=bjp && mns>=aap && mns>=nota){
System.out.println("MNS has won the elections by "+mns +"votes");
}
else if (aap>=cong && aap>=bjp && aap>=mns && aap>=nota){
System.out.println("AAP has won the elections by "+aap +"votes");
}

else{
System.out.println("NOTA has won the elections by "+nota +"votes");
}





}
}


}



