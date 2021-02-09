import java.util.Scanner;
class Conte
{
   public static void main(String args[]) 
   {
Scanner sc = new Scanner(System.in);
System.out.print("Are you 12th pass out or not: y\\\\n");
 char input1 = sc.next().charAt(0);
if(input1 == 'y')
{
System.out.print("Enter your 12 no.:");
int input2=sc.nextInt();
if(input2>70){
System.out.println("You Are elegible for ENGINEERING:");
}
else if(input2<70 && input2>60){
System.out.println("You are elegible for MBBS:");
}
else{
System.out.println("you are not for any kaam:-");
}}
else{
System.out.println("You are not Elegible");
}
}
}
