 class linearsearch {
    public static void linear(int[] arr,int data){
for(int i=0;i<arr.length;i++){
    if(arr[i]==data){
        System.out.print(arr[i]);
    }
    else{
        System.out.print("index not found");
    }
}

    }
}
public static void main(String[]args){
    int[] arr={2,3,4,5};
    int data=3;
    linear(arr,data);
}
