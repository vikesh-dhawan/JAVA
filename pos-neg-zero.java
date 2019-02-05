import java.util.Scanner;
class input
{
public static void main(String args[])
{
int a;
Scanner obj=new Scanner(System.in);
a=obj.nextInt();
if(a>=0)
{
if(a==0)
{
System.out.println("number is zero");
}
else
{
System.out.println("number is positive");
}
}
else
{
System.out.println("number is negative");
}
}
}
