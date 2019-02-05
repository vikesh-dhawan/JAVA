import java.util.Scanner;
class input
{
public static void main(String args[])
{
Scanner obj= new Scanner(System.in);
int a,sum=0,r;
System.out.println("enter number");
a=obj.nextInt();
while(a!=0)
{
r=a%10;
sum=sum*10+r;
a=a/10;
}
System.out.println(sum);
}
}