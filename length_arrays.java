package array;

import java.util.Scanner;

public class length_arrays {
    public static void main(String[] args)
    {
        int a []= new int[5];
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the element arrays");
        for(int i =0;i<5;i++) {
            a[i] = sc.nextInt();
        }
        System.out.print( "length of arrays " + a.length);
    }
}