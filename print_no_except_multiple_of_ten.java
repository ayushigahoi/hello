import java.util.Scanner;



public class print_no_except_multiple_of_ten {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        do{
            System.out.println("enter the number :");
            int n=sc.nextInt();
            if(n%10==0){
                continue;
            }
            System.out.println(n);
        }while(true);
    }
}
