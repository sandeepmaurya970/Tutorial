import java.util.*;
class Pattern{
public static void main(String[] args){
int rows,col;
Scanner sc=new Scanner(System.in);
System.out.print("Enter your rows: ");
rows=sc.nextInt();
System.out.print("Enter the column: ");
col=sc.nextInt();
for(int i=1;i<=rows;i++)
	{
	if(i%2==1){{
	for(int j=1;j<=col; j++)
	{
	System.out.print(j);	
	}
	System.out.print(" ");
	}}
	else
	for(int j=col;j>=1;--j){
	System.out.print(j);
	}
	System.out.println(" ");
	}

}
}