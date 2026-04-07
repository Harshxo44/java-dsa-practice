//Print number 1 to N by backTracking using Recursion
import java.util.Scanner;
public class problem_3{
    static void printNum(int i, int n){
        if(i<1){
            return;
        }
    printNum(i-1, n);
    System.out.println(i);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printNum(n, n);
        sc.close();
    }
}