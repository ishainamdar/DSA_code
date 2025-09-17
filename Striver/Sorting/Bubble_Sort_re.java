package Sorting;

public class Bubble_Sort_re {
    public static void bubbleSort(int arr[],int n){
        int temp=0;
        if(n==1){
            return ;
        }
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]>arr[i+1]){
                temp=arr[i];
                arr[i]=arr[i+1];
                arr[i+1]=temp;
                System.out.println("in if");
            }
        }
        bubbleSort(arr, --n);
    }
    public static void main(String[] args) {
        int arr[]={14,32,78,22,45};
        bubbleSort(arr, arr.length);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}
