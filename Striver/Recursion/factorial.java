public class factorial {
    static int fact=1;
    static void fun(int i,int n){
        if(i<1){
            return;
        }
        fun(i-1,fact*=i);

    }
    public static void main(String[] args) {
        fun(5,0);
        System.out.println(fact);
    }
}

