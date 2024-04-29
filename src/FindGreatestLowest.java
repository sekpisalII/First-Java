import java.util.Scanner;

public class FindGreatestLowest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int [][] arr = new int[new Scanner(System.in).nextInt()]
                [new Scanner(System.in).nextInt()];

        for (int i = 0 ;i<arr.length;++i){
            for (int j = 0; j<arr[i].length;++j){
                System.out.print( "Enter Value  of Arr ["+ i +"]" + " ["+ j +"] = ");
                arr[i][j] = scanner.nextInt();
            }
        }
        System.out.println("======================");
        for (int i = 0 ;i<arr.length;++i){
            for (int j = 0; j<arr[i].length;++j){
                System.out.print(arr[i][j] + " ");
            }
        }
    }
}