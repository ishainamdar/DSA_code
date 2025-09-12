package Sorting;

public class Insertion_Sort {
    public static void insertion(int arr[],int n){
        int temp=0;
        boolean flag=false;
        int cnt=0;
        for(int i=0;i<n-1;i++){
                for(int j=i+1;j>0;j--){
                    if(arr[j]>arr[j-1]){
                        //System.out.println("here");
                        temp=arr[j];
                        arr[j]=arr[j-1];
                        arr[j-1]=temp;
                        cnt++;
                        flag=true;
                    }
                }
                if(!flag){
                    System.out.println(cnt);
                    break;
                }
            
        }
    }
    public static void main(String[] args) {
        //int arr[]={1,3,2,5,4};
        int arr[]={5,4,3,2,1};
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        insertion(arr, arr.length);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
//wort and avg tc => O(N^2)
//best O(N)