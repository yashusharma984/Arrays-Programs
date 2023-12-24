package array;

import java.util.Arrays;
import java.util.Scanner;

public class sortMethid_arr {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int a[] = new int[5];
        System.out.println("enter the elements");
        for (int i = 0; i < a.length; i++)
        {
            a[i] = sc.nextInt();
        }
        Arrays.sort(a); // auotmaticaly arrnage in a systamatically orders
        for (int i = 0; i < a.length; i++)
        {
            System.out.println( a[i] + " ");
        }
    }
}