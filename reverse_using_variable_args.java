import java.util.*;
class rev{
public static void main(String...args)
{
//System.out.println("Welcome to real world");
Scanner sc=new Scanner(System.in);
System.out.print("Enter your Number: ");
int num,temp,sum=0;
num=sc.nextInt();
temp=num;
while(num!=0)
{
sum=sum*10+num%10;
num=num/10;
}
System.out.println("The reverse of "+temp+" is "+sum);
}
}