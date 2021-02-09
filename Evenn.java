import java.util.*;
class Test
{
public static void main(String args[])
{
System.out.print("enter the number");
Scanner tc=new Scanner(System.in);
int num=tc.nextInt();
if(num%2==0)
{
System.out.println(num + " is even number" );
}
else
{
System.out.println(num+" is an odd number");
}
}
}