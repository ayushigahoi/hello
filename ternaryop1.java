import java.util.Scanner;

public class ternaryop1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int marks =sc.nextInt();
        String reportcard=marks>=33?"pass":"fail";
        System.out.println(reportcard);
    }
}
