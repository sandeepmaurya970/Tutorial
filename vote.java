import java.util.*;
class vote
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
System.out.print("Enter the age: ");
int age=sc.nextInt();
if (age>=18)
{
System.out.println("You are Eligible for vote: ");
}
else
{
System.out.println("You are not eligible for vote: ");
}
}


}