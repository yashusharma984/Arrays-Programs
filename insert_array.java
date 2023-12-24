package array;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

// a[3] =34 67 23
// loc[1] item =100
// a[3+1]=34 100 67 23
public class insert_array {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter array size");
        int size = sc.nextInt();
        int a[] = new int[size +1];
        System.out.println("enter array elements");
        for(int i=0;i<size;i++)
        {
            a[i]=sc.nextInt();
        }
        System.out.println("enter array location");
        int loc = sc.nextInt();
        System.out.println("enter new items");
        int item  = sc.nextInt();
     for(int i =size ;i>loc;i--)
     {
         a[i]=a[i-1];
     }
     a[loc] = item;
     size++;
     for(int i =0;i<size;i++)
     {
         System.out.println(a[i] + " ");
     }
    }
}