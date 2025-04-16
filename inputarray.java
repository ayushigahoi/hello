import java.util.Scanner;

public class inputarray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of array");
        int n=sc.nextInt();
        int arr[] =new int[n];
        System.out.println("enter the value of array");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        for(int k=0;k<arr.length;k++){
            System.out.println(arr[k]);
        }
    }
}
