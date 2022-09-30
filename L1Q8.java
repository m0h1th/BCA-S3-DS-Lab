import java.util.Scanner;
//Write a short Java method that takes an array of int values and determines if there is a pair of distinct elements of the array whose product is even.
public class L1Q8 {
    public static boolean evenprod(int arr[])
    {
        for (int i=0;i<arr.length;i++)
            for (int j=0;j<arr.length;j++)
                if (arr[i]!=arr[j] && (arr[i]*arr[j])%2==0)
                {
                    System.out.println("Pair found: ("+arr[i]+","+arr[j]+")");
                    return true;
                }
        return false;
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.print("Enter the array: ");
        for (int i=0;i<n;i++)
            arr[i]=sc.nextInt();
        boolean b = evenprod(arr);
        if (!b)
            System.out.println("Pair not found");
    }
}
