import java.util.Scanner;

public class RemoveByIndex {
    public static void main (String[]args){
        Scanner scanner = new Scanner(System.in);
        int n;
        System.out.println("Enter N = ");
        n = scanner.nextInt();
        int []arr = new int[n];
        for (int i = 0; i < n; i++)
        {
            System.out.print("Enter arr ["+i+"] = ");
            arr[i] = scanner.nextInt();
        }
        int index;
        System.out.print("Enter Index To Removed = ");
        index = scanner.nextInt();

        int[] temp = arr;
        arr = new int[arr.length-1];

        for (int i = 0,j=0 ;i<temp.length;i++)
        {
            if(i==index)
            {
                continue;
            }
            arr[j] = temp[i];
            j++;

        }
        for(int i = 0 ;i<arr.length;i++)
        {
            System.out.print("arr["+i+"]" + arr[i]);
        }
    }
}
