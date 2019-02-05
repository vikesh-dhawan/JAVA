import java.util.Scanner;
class input{
    public static void main(String []args)
    {
        int i,j,n,flag=0,k,count=0,large=0,ans=0;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        int a[]=new int[n];
          for(i=0;i<n;i++) 
              a[i]=sc.nextInt();
          for(i=0;i<n;i++)
          {
          flag=0;
          count=1;
              for(k=i-1;k>=0;k--)
              {
                  if(a[i]==a[k])
                  {
                      flag=1;
                  }
              }
              if(flag==0)
              {
                  for(j=i+1;j<n;j++)
                  {
                     if(a[i]==a[j])
                     {
                         count++;
                     }
                  }
                  if(count>large)
                  {
                      ans=a[i];
                      large=count;
                  }
              }
          }
          System.out.println(ans);
    }
}