import java.util.Scanner;
class input
{
public static void main(String args[])
{
Scanner obj= new Scanner(System.in);
int a,b,choice,d;
char c;
System.out.println("enter first number");
a=obj.nextInt();
System.out.println("enter second number");
b=obj.nextInt();
System.out.println("enter 1 for add 2 for subtraction");
choice=obj.nextInt();
if(choice==1)
{
d=a+b;
System.out.println(d);
}
if(choice==2)
{
d=a-b;
System.out.println(d);
}
System.out.println("do you want to perform again y/n");
c=obj.next().charAt(0);
while(c!='n')
{
System.out.println("enter first number");
a=obj.nextInt();
System.out.println("enter second number");
b=obj.nextInt();
System.out.println("enter 1 for add 2 for subtraction");
choice=obj.nextInt();
if(choice==1)
{
d=a+b;
System.out.println(d);
}
if(choice==2)
{
d=a-b;
System.out.println(d);
}
System.out.println("do you want to perform again y/n");
c=obj.next().charAt(0);
}
}
}


