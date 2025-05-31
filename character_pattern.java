import java.util.Scanner;

public class character_pattern {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the no. of lines");
        int n =sc.nextInt();
        char ch='A';

//i=no. of lines
//j=no. of char
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(ch);
                ch++;
            }
            System.out.println();
        }

    }
}
