import java.util.Scanner;

public class sum_of_odd_even_no {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number");
        int n=sc.nextInt();
        int evensum=0;
        int oddsum=0;
        for(int i=0;i<=n;i++){
            if(n%2==0){
                evensum+=i;
            }
            else{
                oddsum+=i;
            }
        }
        System.out.println(evensum);
        System.out.println(oddsum);
        
    }
}