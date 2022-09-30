import java.util.Scanner;

public class L1Q6 {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        int count=0;
        while (n>=2)
        {
            n/=2;
            count++;
        }
        System.out.println("The number of times 2 divides "+n+" is: "+count);
    }
}
