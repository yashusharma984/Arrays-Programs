package array;

import java.util.Scanner;

public class minum_value {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int min =0;
        int a[]= new int[5];
        for(int i =0;i<a.length;i++)
        {
            a[i]= sc.nextInt();
        }
        min =a[0];
        for(int i =1;i<a.length;i++)
        {
            if(a[i]<min)
            {
                min =a[i];
            }
        }
        System.out.println("ye array ki minimum value h " + min);
    }
}