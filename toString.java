package array;

import java.util.Arrays;

public class toString {
    public static void main(String[] args)
    {
        String a[]={"yash","bhardwaj","palwal"};

        System.out.println("tostring()  " + Arrays.toString(a));
        System.out.println("asList()  "  + Arrays.asList(a));

        int arr[] [] ={ {40,50,60},{10,20,30} }; // 2 array here
        System.out.println("deeptoString()  " +Arrays.deepToString(arr)); // use for 2d array
    }
}