package Array;
import Method.AccessModifier;

import java.util.Arrays;
import java.util.Scanner;
public class InputArray {

    public static void main (String[] args){
        AccessModifier obj = new AccessModifier();
        Scanner scanner = new Scanner(System.in);
        int index ;
        System.out.print("Enter index for arr = ");
        index = scanner.nextInt();
        String [] names = new String[index];
        for (int i = 0; i<names.length;i++){
            System.out.print("Enter value of array = ");
            names[i] = scanner.nextLine();
            names[i] = scanner.nextLine();
        }
        System.out.println(Arrays.toString(names));

    }
}
