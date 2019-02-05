import java.util.Scanner;
class input
{
public static void main(String args[])
{
Scanner obj= new Scanner(System.in);
int a[],i,n,large=0,small=999;
a=new int[100];
n=obj.nextInt();
for(i=0;i<n;i++)
{
a[i]=obj.nextInt();
}
for(i=0;i<n;i++)
{
if(a[i]>large)
{
large=a[i];
}
}
for(i=0;i<n;i++)
{
if(a[i]<small)
{
small=a[i];
}
}
System.out.println(large);
System.out.println(small);
}
}