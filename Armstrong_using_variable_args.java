import java.util.*;
class Arm{
public static void main(String...args)
{
//System.out.println("Welcome to real world");
Scanner sc=new Scanner(System.in);
System.out.print("Enter your Number: ");
int num,temp,sum=0,nu;
num=sc.nextInt();
temp=num;
while(num!=0)
{
nu=num%10;
sum=sum+nu*nu*nu;
num=num/10;
}System.out.println(sum);
System.out.println(temp);
/*if(temp==sum){
System.out.println("||||||||||||||Palindrome|||||||||||||");}
else{
System.out.println("!!!!!!!!!!!!Not a Palindrome!!!!!!!!!!!");}
}*/
}}