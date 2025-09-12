package Sorting;

public class Selection_Sort {
    static void selection(int arr[],int n){
        int temp=0;
        int mini;
        for(int i=0;i<n;i++){
            mini=i;
            for(int k=i;k<n;k++){       
                if(arr[k]<=arr[mini]){
                    mini=k;
                    System.out.println(arr[mini]);
                }
            }

                temp=arr[mini];
                arr[mini]=arr[i];
                arr[i]=temp;
        }
    }
    public static void main(String[] args) {
       int arr[]={50,40,30,60,20};
       for(int i=0;i<arr.length;i++){
        System.out.print(arr[i]+" ");
       }
       System.out.println();
       selection(arr,arr.length); 
       for(int i=0;i<arr.length;i++){
        System.out.print(arr[i]+" ");
       }
    }
    

}
