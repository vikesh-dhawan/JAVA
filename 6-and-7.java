import java.util.Scanner;
class input{
    public static void main(String []args)
    {
        int i,j,n,index=-1,index1=-1,sum=0;
         Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        int a[]=new int[n];
          for(i=0;i<n;i++) 
              a[i]=sc.nextInt();
         for(i=0;i<n;i++){
             if(a[i]==6)
                 index=i;
             if(a[i]==7)
                 index1=i;
         }
         if(index<index1)
         {
             for(i=0;i<index;i++)
             {
                 sum=sum+a[i];
             }
             for(i=index1+1;i<n;i++)
             {
                 sum=sum+a[i];
             }
         }
         else
         {
              for(i=0;i<n;i++)
             {
                 sum=sum+a[i];
             }
         }
         System.out.println(sum);
              
    }
}