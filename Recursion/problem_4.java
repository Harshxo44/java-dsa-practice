//Print N to 1 using recursion
import java.util.Scanner;
public class problem_4 {

    static void printNum(int i, int n) {
        if (i > n) {
            return;
        }
        printNum(i + 1, n);
        System.out.println(i);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        printNum(1, n);

        sc.close();
    }
}