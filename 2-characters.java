import java.util.Scanner;
class input
{
public static void main(String args[])
{
Scanner obj= new Scanner(System.in);
char a,b;
a=obj.next().charAt(0);
b=obj.next().charAt(0);
if(a<b)
{
System.out.println(a + "," +b);
}
else
{
System.out.println(b + "," +a);
}
}
}