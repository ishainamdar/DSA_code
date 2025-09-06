class Print1_n{
    static void fun(int i,int n){
        if(i==n){
            return;
        }
        System.err.println(i);
        fun(++i,n);
    }
    public static void main(String[] args) {
        fun(1,6);
    }
}