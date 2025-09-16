package Sorting;

import java.util.Vector;

public class Merge_Sort {
    public static void  mS(Vector<Integer> arr,int low,int high){
        if(low==high)return;
        int mid=(low+high)/2;
        mS(arr,low,mid);
        mS(arr,mid+1,high);
        merge(arr,low,mid,high);
    }
    private static void merge(Vector<Integer> arr, int low, int mid, int high) {
        Vector<Integer> temp = new Vector<>();
        int left =low;
        int right=mid+1;
        while(left<=mid && right<=high){
            if(arr.elementAt(left)<=arr.elementAt(right)){
                temp.add(arr.elementAt(left));
                left++;
            }
            else{
                temp.add(arr.elementAt(right));
                right++;
            }
        }
        while(left<=mid){
            temp.add(arr.elementAt(left));
            left++;
        }
        while(right<=high){
            temp.add(arr.elementAt(right));
            right++;
        }
        for(int i=low;i<=high;i++){
            arr.set(i, temp.elementAt(i-low));
        }
    }
    public static void main(String[] args) {

        Vector<Integer> arr =new Vector<>();
        arr.add(3);
        arr.add(4);
        arr.add(5);
        arr.add(1);
        arr.add(9);
        arr.add(2);
        arr.add(6);
        arr.add(8);
        System.out.println(arr);

        mS(arr,0,arr.size()-1);

        System.out.println(arr);

    }
}
