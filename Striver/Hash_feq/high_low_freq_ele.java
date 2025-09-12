package Hash_feq;

import java.util.HashMap;
import java.util.Map;

public class high_low_freq_ele {
    public static void main(String[] args) {
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        int k=0;
        int l=0;
        int arr[]=new int[]{10,20,30,20,30,30};
        Map<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<arr.length;i++){
            if(map.containsKey(arr[i])){
                map.put(arr[i],map.get(arr[i])+1);
            }
            else{
                map.put(arr[i], 1);
            }
            if(map.get(arr[i])<min){
                min=map.get(arr[i]);
                k=arr[i];
            
            }
            if(map.get(arr[i])>max){
                max=map.get(arr[i]);
                l=arr[i];
            }
        }
        System.out.println(k+" "+min);
        System.out.println(l+" "+max);

        
    }
}
