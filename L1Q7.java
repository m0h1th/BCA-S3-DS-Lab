import java.util.Scanner;

public class L1Q7 {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of lines: ");
        int n = sc.nextInt();
        System.out.println("Enter the lines: ");
        String lines[] = new String[n+1];
        for (int i=0;i<=n;i++)
            lines[i]=sc.nextLine();
        System.out.println("The lines in reverse are: \n");
        for (int i=n;i>=0;i--)
            System.out.println(lines[i]);
    }
}
