import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number :");
        int input = sc.nextInt();
        int count =0;
        int i=1;
        while (count<=input)
        {
            if(isPrimeNumber(i))
            {
                System.out.println(i);
                count=count+1;
            }
           i=i+1;
        }

    }
    public static boolean isPrimeNumber(int n) {
        if (n < 2) {
            return false;
        }
        int squareRoot = (int) Math.sqrt(n);
        for (int i = 2; i <= squareRoot; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
