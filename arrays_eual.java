package array;

import java.util.Arrays;
import java.util.Scanner;

public class arrays_eual {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int a []= new int[5];
        int a2[]= new int[5];
        System.out.println("enter the first arrays");
        for(int i =0;i<a.length;i++)
        {
            a[i]= sc.nextInt();
        }
        System.out.println("enter the second arrays");
        for(int i=0;i<a2.length;i++)
        {
            a2[i]=sc.nextInt();
        }
        boolean b = Arrays.equals(a,a2);
        System.out.println("kya ye equal h " + b );
    }
}