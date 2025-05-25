import java.util.Scanner;

public class print_reverse_of_no {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the number");
        int n=sc.nextInt();
        while (n>0) {
            int lastdigit=n%10;
            System.out.print(lastdigit);
            n/=10;
        }
        System.out.println();

    }
}
