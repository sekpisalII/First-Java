package Array;

import java.util.Scanner;

public class ArrayAvg {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int index;
        double total=0,avg;
        System.out.print("Input index arr = ");
        index = scanner.nextInt();
        int [] arr = new int[index];

        for (int i = 0 ; i<arr.length;i++){
            System.out.print("arr[" + i +"] = ");
            arr[i] = scanner.nextInt();
        }
        for (int j = 0; j<arr.length;j++){
            total +=arr[j];
        }
        avg = total / index;
        System.out.println("Total score is = " + total);
        System.out.print("Avg is = " + avg);
    }
}
