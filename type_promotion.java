public class type_promotion {
    public static void main(String[] args) {
        int i=1000;
        byte b=4;
        char c='a';
        float f=3.12f;
        short s=512;
        double d=99.99;
         int result= (int) ((f*b)+(i%c)-(d*s));
        System.out.println("result is:"+result);

    }
}
