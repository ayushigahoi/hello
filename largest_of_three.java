import java.util.Scanner;

public class largest_of_three {
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
        System.out.print("enter the first no.");
        int a=sc.nextInt();
        System.out.println("enter the second number");
        int b=sc.nextInt();
        System.out.println("enter the third no.");
        int c= sc.nextInt();
        if(a>=b &&a>=c){
            System.out.println("a is greater");
        }
        else if(b>=c){
            System.out.println("b is greater");
        }
        else{
            System.out.println("c is greater");
        }
    }
}
