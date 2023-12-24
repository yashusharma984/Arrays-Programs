package array;

import java.util.Arrays;
import java.util.Scanner;

public class copy_method {
    public static void main(String[] args)
    {

        Scanner sc = new Scanner(System.in);
        int a[] = new int[5];
        System.out.println("enter the elements in array 1");
        for (int i = 0; i < a.length; i++)
        {
            a[i] = sc.nextInt();
        }
        int a2[] = Arrays.copyOf(a,5);
        System.out.println("element in array 2");
            for(int i =0;i<a.length;i++)
            {
                System.out.println(a2[i] + " ");
            }
    }
}