package Array;

import java.util.Arrays;

public class multiArray {
    public static void main (String [] args){
        int [][] numbers = {{1,2},{3,4},{5,6},{7,8}};
        System.out.println(numbers[0].length);
        System.out.println("=========================");
        System.out.println(Arrays .deepToString(numbers));

    }
}
