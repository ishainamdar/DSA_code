package Sorting;

public class Bubble_Sort {
    public static void bubble(int arr[],int n){
        int temp=0;
        boolean flag=false;
        int cnt=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<n-i-1;j++){
                if(arr[j]>arr[j+1]){
                    temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    flag=true;
                    cnt++;
                }
            }
            if(flag){
                System.out.println(cnt);
                break;
            }
            

        }
    }
    public static void main(String[] args) {
        //int arr[]={13,46,24,52,20,9};
        int arr[]={1,3,2,5,4};
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        bubble(arr, arr.length);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
       
    }

}
//Worst cse=> TC O(N2)
//Best case=> TC O(N)
