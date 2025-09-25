public class remove_dup {
    
    public static int[] removedup(int arr[]){

        int i=0;
        for(int j=0;j<arr.length;j++){
            if(arr[j]!=arr[i]){
                arr[i+1]=arr[j];
                i++;
            }
        }
        int[] arr2 = new int[i + 1];
        for (int k = 0; k <= i; k++) {
            arr2[k] = arr[k];
        }
        return arr2;
    }
    public static void main(String[] args) {
        int arr[]={1,1,2,2,2,3,3,3,4,4,5,5};
        int arr2[]=removedup(arr);
        for(int i=0;i<arr2.length;i++){
            System.out.print(arr2[i]+"");
        }
      //  System.out.println();

    }
}
