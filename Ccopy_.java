package array;

import java.util.Scanner;

public class Ccopy_ {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of array");
        int size = sc.nextInt();
        int a[] = new int[size];
        int b[] = new int[size];
        System.out.println("enter the arrays elements");
        for (int i = 0; i < size; i++)
        {
            a[i] = sc.nextInt();
        }
        System.out.println("printed array elements");
        for (int i = 0; i < size; i++)
        {
            System.out.println(a[i] + " ");
        }
        System.out.println("copy arrays elements");
        for (int i = 0; i < size; i++)
        {
            b[i] = a[i];
            System.out.println(b[i] + " ");
        }
        System.out.println(b.length  + " length of arrays");
    }
}