import java.util.Scanner;
import java.util.*;
import java.io.*;
class input{
    public static void main(String []args)
    {
        int i,n;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        int a[]=new int[n];
        for(i=0;i<n;i++)
            a[i]=sc.nextInt();
        Arrays.sort(a);
        for(i=0;i<n;i++)
            System.out.println(a[i]);
    }
}