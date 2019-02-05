import java.util.Scanner;
class input
{
public static void main(String args[])
{
Scanner obj= new Scanner(System.in);
char colour;
colour=obj.next().charAt(0);

switch(colour)
{
case 'R':
System.out.println("R->Red");
break;
case 'G':
System.out.println("G->Green");
break;
case 'B':
System.out.println("B->Blue");
break;
case 'O':
System.out.println("O->Orange");
break;
case 'Y':
System.out.println("Y->Yellow");
break;
case 'W':
System.out.println("W->White");
break;
default:
System.out.println("Invalid Code");
}
}
}