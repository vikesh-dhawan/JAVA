import java.util.Scanner;
class input
{
public static void main(String args[])
{
Scanner obj= new Scanner(System.in);
char a,b;
a=obj.next().charAt(0);
if((a>=65 && a<=90))
{
System.out.println(a + "->" + Character.toLowerCase(a));
}
else
{
System.out.println(a + "->" + Character.toUpperCase(a));
}
}
}