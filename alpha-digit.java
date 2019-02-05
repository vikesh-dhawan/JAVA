import java.util.Scanner;
class input
{
public static void main(String args[])
{
Scanner obj= new Scanner(System.in);
char a,b;
a=obj.next().charAt(0);
if((a>=65 && a<=90)||(a>=97 && a<=122))
{
System.out.println("alphabet");
}
else if(a>47 && a<58)
{
System.out.println("digit");
}
else
{
System.out.println("special character");
}
}
}