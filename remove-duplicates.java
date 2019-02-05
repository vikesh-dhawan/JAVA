import java.util.Scanner; 
class input {
    public static void main(String args[])
    {
        int a[]=new int[20];
        int i,n,j;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        for(i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        for(i=0;i<n;i++)
        {
            for(j=i-1;j>=0;j--)
            {
                if(a[i]==a[j])
                {
                    a[i]=0;
                }
            }
        }
        for(i=0;i<n;i++)
        {
            if(a[i]!=0)
            System.out.println(a[i]);
        }
    }
}
