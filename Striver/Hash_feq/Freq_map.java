package Hash_feq;

// import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Freq_map {
     
    public static void main(String[] args) {
       // int hash[]=new int[256];
       int arr[]=new int[]{10,20,30,10,20,40};
       //Arrays.sort(arr);
        Map<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<5;i++){
            if(map.containsKey(arr[i])){
                map.put(arr[i], map.get(arr[i])+1);
            }else{
                map.put(arr[i], 1);
            }
        }
        for(Map.Entry<Integer,Integer> e:map.entrySet()){
            System.out.println(e.getKey()+" "+e.getValue());
        }
        
    }
}
