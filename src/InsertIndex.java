import java.util.Scanner;

public class InsertIndex {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        int n;
        System.out.print("Enter N = ");
        n = scanner.nextInt();
        int[]arr=new int[n];

        for(int i=0; i<n; i++)
        {
            System.out.print("Enter arr ["+ i +"] = ");
            arr[i] = scanner.nextInt();
        }
        int index, value;
        do
        {
            System.out.print("Enter Index to insert = ");
            index= scanner.nextInt();
        } while (!(index >= 0 && index < n));

        System.out.print("Enter Value to insert = ");
        value= scanner.nextInt();
        int[] temp = arr;
        arr=new int[n+1];

        for(int i=0,j=0; i < arr.length; i++)
        {
            if (i == index)
            {
                arr[i] =value;
                continue;
            }
            arr[i] = temp[j];
            j++;
        }

        for(int i=0;i<arr.length;i++)
        {
            System.out.println("arr[" + i + "] = " + arr[i] );
        }
    }
}
