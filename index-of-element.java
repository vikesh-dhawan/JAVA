import java.util.Scanner;
class input
{
public static void main(String args[])
{
Scanner obj= new Scanner(System.in);
int a[],n,j,i,flag=0;
a=new int[100];
System.out.println("enter size");
n=obj.nextInt();
for(i=0;i<n;i++)
{
a[i]=obj.nextInt();
}
j=obj.nextInt();
for(i=0;i<n;i++)
{
if(a[i]==j)
{
flag=1;
System.out.println(i+1);
}
}
if(flag==0)
{
System.out.println("-1");
}
}
}