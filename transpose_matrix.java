package array;

import java.util.Scanner;

public class transpose_matrix {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int a[][]= new int[2][2];
        System.out.println("enter the elements the elements");
        for(int i =0;i<2;i++)
        {
            for(int j =0;j<2;j++)
            {
                a[i][j]= sc.nextInt();
            }
        }
        System.out.println("print the elements");
        for(int i=0;i<2;i++)
        {
            for(int j =0;j<2;j++)
            {
                System.out.print(a[i][j] + " ");
            }
            System.out.print("\n");
        }
        System.out.println("transpose  the elements");
        for(int i =0;i<2;i++)
        {
            for(int j=0;j<2;j++)
            {
                System.out.print(a[j][i] + " ");
            }
            System.out.print("\n");
        }
    }
}