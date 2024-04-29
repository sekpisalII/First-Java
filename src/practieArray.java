import java.util.Scanner;

public class practieArray {
    public static void main (String [] args){
        Scanner scanner = new Scanner(System.in);
           //No Duplicate static arr
        int n;
        System.out.print("Enter index for array  = ");
        n= scanner.nextInt();
        int[]arr=new int[n];
        for(int i = 0; i < n; i++)
        {
            if (i == 0)
            {
                System.out.print("Enter Arr ["+i+"]=");
                arr[i] = scanner.nextInt();
            }
            else
            {
                System.out.print("Enter Arr ["+i+"]=");
                int temp= scanner.nextInt();
                boolean b = false;
                for(int j=0;j<i;j++)
                {
                    if(temp == arr[j])
                    {
                        b = true;
                        break;
                    }
                }
                if (b)
                {
                    i--;
                    continue;
                }
                arr[i] = temp;
            }
        }
        System.out.println("------------------");
        for (int i = 0;i < n;i++)
        {
            System.out.println("Arr["+i+"] = " + arr[i]);
        }
    }
}
