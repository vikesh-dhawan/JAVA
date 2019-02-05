import java.util.Scanner;
class input
{
public static void main(String args[])
{
Scanner obj= new Scanner(System.in);
int a,sum=0,r,n;
System.out.println("enter number");
a=obj.nextInt();
n=a;
while(a!=0)
{
r=a%10;
sum=sum*10+r;
a=a/10;
}
if(n==sum)
{
System.out.println("palindrome number "); 
}   
else
{
System.out.println("not palindrome");  
}
}
}
