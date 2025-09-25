// public class second_largest {
//     public static void main(String[] args) {
//         int arr[]={4,5,9,2,7,8};
//         int max=arr[0];
        
//         for(int i=1;i<arr.length;i++){
//             if(max<arr[i]){
//                 max=arr[i];
//             }
//         }
//         int max2=arr[0];
//         System.out.println(max);
//         for(int i=0;i<arr.length-1;i++){
//             if(arr[i]>=max2 && max2!=max){
//                 max2=arr[i];
//                 System.out.println(max2);

//             }
//         }
//         System.out.println(max2);
//     }
// }
public class SecondLargest {
    public static void main(String[] args) {
        int arr[] = {4, 5, 9, 2, 7, 8};

        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;

        for (int num : arr) {
            if (num > max) {
                secondMax = max;
                max = num;
            } else if (num > secondMax && num != max) {
                secondMax = num;
            }
        }

        System.out.println("Largest: " + max);
        System.out.println("Second Largest: " + secondMax);
    }
}
