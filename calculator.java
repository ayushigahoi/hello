import java.util.Scanner;

import javax.sound.midi.SysexMessage;

public class calculator {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter your first number");
        int a =sc.nextInt();
        System.out.println("enter your second number");
        int b = sc.nextInt();
        System.out.println("enter your command");
        char c = sc.next().charAt(0);
        switch(c){
            case'+':
            System.out.println(a+b);
            break;
            case '-':
            System.out.println(a-b);
            break;
            case'*':
            System.out.println(a*b);
            break;
            default:
            System.out.println(a/b);
        }
    }
    
}
