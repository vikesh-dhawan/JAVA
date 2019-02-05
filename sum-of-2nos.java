import java.util.Scanner;
class input
{
public static void main(String args[])
{
Scanner obj = new Scanner(System.in);
int a,b,c;
System.out.println("enter first no.");
a=obj.nextInt();
System.out.println("enter second no.");
b=obj.nextInt();
c=a+b;
System.out.println("The sum of " + a +" and " +b +" is " + c);
}
}
