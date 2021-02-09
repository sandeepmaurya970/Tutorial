import java.util.*;
class leap{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
System.out.print("Enter the Year\\");
int year=sc.nextInt();
if ((year%4==0 && year%100!=0) || year%400==0)
	{
		System.out.print("This is Leap yaer:-");
	}
else
	{
		System.out.println("This is not a Leap year");
	}
}}