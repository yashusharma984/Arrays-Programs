package array;

import java.util.Scanner;

public class d2_arrays {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int a[][]= new int[2][2];
        System.out.println("enter the arrays elements");
        for(int i=0;i<2;i++)
        {
                for(int j=0;j<2;j++)
                {
                    a[i][j]=sc.nextInt();
            }
        }
        System.out.println("matrix print here");
        for(int i =0;i<2;i++)
        {
            for(int j=0;j<2;j++)
            {
                System.out.print(a[i][j] + " ");
            }
            System.out.print("\n");
        }
    }
}