package Hash_feq;

public class Cnt_Freq {
    
public static void fun(int[] arr,int hash[]){
        for(int i=0;i<arr.length;i++){
            hash[arr[i]]+=1;
        }
        
    }    
    public static void main(String[] args) {
    System.out.println("hello");
    System.out.println("hello");
        int hash[]=new int[256];
        int arr[]={10,5,10,15,10,5};
        //int num=10;
        fun(arr, hash);
        int i=0;
        while(i<5){
            System.out.println(arr[i]+" is occured "+hash[arr[i]]);
            i++;
        }
}
}
