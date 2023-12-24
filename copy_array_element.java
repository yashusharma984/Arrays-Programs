package array;

import java.util.Scanner;

// first -->a[]= 10,20,30 second--> b[]=10,30,50
public class copy_array_element {
    public static void main(String[] args) {
        int a[] = new int[5];
        int b[] = new int[5];
        Scanner sc = new Scanner(System.in);
        System.out.println("enter value in first array");
        for (int i = 0; i < 5; i++) {
            a[i] = sc.nextInt();
        }
        System.out.print ("print the array first");
        for (int i = 0; i < 5; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.print("second array");
        for (int i = 0; i < 5; i++)
        {
            b[i] = a[i];
            System.out.print( b[i] + " ");
        }
    }
}