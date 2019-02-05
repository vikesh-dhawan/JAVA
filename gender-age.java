import java.util.Scanner;
class input
{
public static void main(String args[])
{
Scanner obj= new Scanner(System.in);
String s;
int age;
System.out.println("enter your gender");
s=obj.next();
System.out.println("enter age");
age=obj.nextInt();
if(s.equals("female"))
{
if(age>=1 && age<=58)
{
System.out.println("Interest=8.2%");
}
else
{
System.out.println("Interest=7.6%");
}
}
else
{
if(age>=1 && age<=60)
{
System.out.println("Interest=9.2%");
}
else
{
System.out.println("Interest=8.3%");
}
}
}
}