import java.util.Scanner;
class input
{
public static void main(String args[])
{
int a;
Scanner obj=new Scanner(System.in);
a=obj.nextInt();
if(a%2==0)
{
System.out.println("number is even");
}
else
{
System.out.println("number is odd");
}
}
}