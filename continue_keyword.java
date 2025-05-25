public class continue_keyword {
    public static void main(String[] args) {
        for(int i=0;i<=10;i++){
            if(i==6){
                continue;
            }
            if (i==8) {
                continue;
            }
            System.out.println(i);
        }
    }
}

//continue is used to skip the iteration.