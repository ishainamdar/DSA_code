public class Sum_n {
    static int sum=0;
    static void fun(int i,int n){
        if(i<1){
            return;
        }
        fun(i-1,sum+=i);

    }
    public static void main(String[] args) {
        fun(5,0);
        System.out.println(sum);
    }
}
/*
 * 
 * int sum=N*(N+1)/2;
 */
