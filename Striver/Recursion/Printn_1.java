public class Printn_1 {
    static void fun(int i,int n){
        if(i<1){
            return;
        }
        System.err.println(i);
        fun(--i,n);
    }
    public static void main(String[] args) {
        fun(6,6);
    }

}
