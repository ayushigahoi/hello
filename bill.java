import java.util.Scanner;

public class bill {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the first amount");
        float pencil=sc.nextFloat();
        System.out.println("enter the second amount");
        float eraser =sc.nextFloat();
        System.out.println("enter the third amount");
        float pen=sc.nextFloat();
        float total=pen+eraser+pen;
        System.out.println("total is:"+total);
         
        //18% ofgst tax
        float newtotal=total+(0.18f*total);
        System.out.println("newtotal is:"+newtotal);
    }
}
