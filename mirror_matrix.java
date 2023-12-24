package array;

import java.util.Scanner;

public class mirror_matrix {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int a [][]= new int[2][2];
        System.out.println("enter the array elemtns");
        for(int i=0;i<2;i++)
        {
            for(int j=0;j<2;j++)
            {
                a[i][j]= sc.nextInt();
            }
        }
        System.out.println("array print here");
        for(int i=0;i<2;i++)
        {
            for(int j=0;j<2;j++)
            {
                System.out.print(a[i][j] + " ");
            }
            System.out.print("\n");
        }
        System.out.println("mirror elements");
        for(int i=0;i<2;i++)
        {
            for(int j=1;j>=0;j--)
            {
                System.out.print(a[i][j] + " ");
            }
            System.out.print("\n");
        }
    }
}