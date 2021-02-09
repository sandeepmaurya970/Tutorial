import java.util.*;
class ArmstrongNumberBetweenRange{
public static void main(String...args){
Scanner sc=new Scanner(System.in);
int i,num1,num2,rem,sum=0,temp1,num=0;
System.out.print("Enter the Starting Point: ");
num1=sc.nextInt();
System.out.print("Enter the last point: ");
num2=sc.nextInt();
for(i=num1;i<=num2;i++){

temp1=i;

	while(temp1!=0)
		{
		rem=temp1%10;
		sum=sum+rem*rem*rem;
		temp1=temp1/10;
		}
		if (sum==i)
		{
		System.out.println(i);
		}
num=0;
sum=0;	
}
}}