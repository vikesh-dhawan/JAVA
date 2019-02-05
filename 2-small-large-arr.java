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
        System.out.println(a[0]);
        System.out.println(a[1]);
        System.out.println(a[n-1]);
        System.out.println(a[n-2]);
    }
}