package Hash_feq;

public class Char_Freq {
        
public static void fun(char[] arr,int hash[]){
        for(int i=0;i<arr.length;i++){
            hash[arr[i]]+=1;
        }
        
    }    
    public static void main(String[] args) {
        int hash[]=new int[256];
        char arr[]={'a','b','b'};
        fun(arr, hash);
        int i=0;
        while(i<=5){
            System.out.println(arr[i]+" is occured "+hash[arr[i]]);
            i++;
        }
}
}
