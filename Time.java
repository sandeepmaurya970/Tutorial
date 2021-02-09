import java.util.*;
public class Time{
public static String TimeToMinute(int num2)
{
int hour,minute;
String display;
hour=num2/60;
minute=num2%60;
display=hour + ":" + minute;
return display;
}
public static void main(String[] args)
{
System.out.print("Enter your number: ");
Scanner sc=new Scanner(System.in);
int num1=sc.nextInt();
System.out.print(TimeToMinute(num1));
}
}