import java.util.Scanner;
class input
{
public static void main(String args[])
{
Scanner obj= new Scanner(System.in);
int i,a,flag=0;
System.out.println("enter integer");
a=obj.nextInt();
if(a==0 || a==1)
{
System.out.println(a+" is not prime number");
}
else
{
for(i=2;i<=a/2;i++)
{
if(a%i==0)
{
flag=1;
break;
}
}
}
if(flag==0)
{
System.out.println(a+" is prime number");
}
else
{
System.out.println(a+" is not prime number");
}
}
}