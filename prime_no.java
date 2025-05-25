import java.util.Scanner;

public class prime_no {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a no.");
        int n= sc.nextInt();
        if(n==2){
            System.out.println("no. is prime");
        }else{

        boolean isPrime=true;
        for(int i=2;i<=n-1;i++){
            //  more optmize form
            //for(int i=2;i<=Math sqrt(n);i++)
            if(n%i==0){
                isPrime=false;
            }
        }

        if(isPrime==true){
            System.out.println("no. is prime");
        }else{
            System.out.println("no. is not prime");
        }

    }

    }
}