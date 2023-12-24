package array;

import java.util.Scanner;

public class search_arraysssss {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a[] = new int[5];
        int count = 0;
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }
        System.out.println("printed the elements");
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i] + " ");
        }
        System.out.println("searched elements");
        int n = sc.nextInt();
        for (int i = 0; i < a.length; i++) {
            if (a[i] == n) {
                count++;
            }
        }
            if (count > 0) {
                System.out.println("item found");
            } else {
                System.out.println("not found");
            }
        }
    }
