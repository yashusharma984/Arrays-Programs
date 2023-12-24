package array;

import java.util.Scanner;

public class add_2_matrix {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int a[][]= new int[2][2];
        int b[][]= new int[2][2];
        int c[][]= new int[2][2];
        System.out.println("enter the first matrix");
        for(int i=0;i<2;i++)
        {
            for(int j =0;j<2;j++)
            {
                a[i][j]=sc.nextInt();
            }
        }
        System.out.println("enter the second matrix");
        for(int i=0;i<2;i++)
        {
            for(int j =0;j<2;j++)
            {
                b[i][j]=sc.nextInt();
            }
        }
        System.out.println("print matrix");
        for(int i=0;i<2;i++)
        {
            for(int j =0;j<2;j++)
            {
                System.out.print( a[i][j] + " ");
            }
            System.out.print("\n");
        }
        System.out.println("second matrix");
        for(int i=0;i<2;i++)
        {
            for(int j =0;j<2;j++)
            {
                System.out.print(b[i][j] + " ");
            }
            System.out.print("\n");
        }
        System.out.println("printed final matrix");
        for(int i=0;i<2;i++)
        {
            for(int j =0;j<2;j++)
            {
               c[i][j]= a[i][j] +b[i][j];
                System.out.print(c[i][j] + " ");
            }
            System.out.print("\n");
        }
    }
}