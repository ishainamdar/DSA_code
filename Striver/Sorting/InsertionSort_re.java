package Sorting;

public class InsertionSort_re {
    public static void insertionSort(int arr[], int n,int i){
        int temp=0;
        if(i==n){
            return;
        }
        for(int j=i++;j>0;j--){
                    if(arr[j]<arr[j-1]){
                        //System.out.println("here");
                        temp=arr[j];
                        arr[j]=arr[j-1];
                        arr[j-1]=temp;
                    }
                }
        insertionSort(arr, n, i);
    }
    public static void main(String[] args) {
        
        int arr[]={14,32,78,22,45};
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        insertionSort(arr, arr.length,0);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}
