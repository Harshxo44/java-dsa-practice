// Print numbers from n to 1 using recursion // BackTracking
import java.util.Scanner;

public class problem_1 {

    static void printNumbers(int i, int n) {
        if (i < 1 ) {
            return;
        }
        System.out.println(i);
        printNumbers(i - 1, n);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        printNumbers(n, n);

        sc.close();
    }
}