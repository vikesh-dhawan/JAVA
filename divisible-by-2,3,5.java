class input
{
public static void main(String args[])
{
int a,count=0,i,n;
for(i=1;i<200;i++)
{
if(count==5)
{
break;
}
else
{
if(i%2==0 && i%3==0 && i%5==0)
{
System.out.println(i);
count++;
}
}
}
}
}