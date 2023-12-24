package array;

import java.util.Arrays;
import java.util.Scanner;

public class copy_method_copy {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int a[]= new int [5];
        System.out.println("enter the arrays");
        for(int i=0;i<a.length;i++)
        {
            a[i]= sc.nextInt();
        }
        System.out.println("they  are copy elments");
        int a2[]= Arrays.copyOf(a,5);
       for(int i=0;i<a.length;i++)
       {
           System.out.println(a2[i] + " ");
       }
    }
}