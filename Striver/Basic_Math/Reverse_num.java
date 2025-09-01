public class Reverse_num {
    public static void main(String[] args) {
        int N=12345;
        int temp=N;
        int rev=0;
        while(temp!=0){
            rev = rev * 10+(temp%10);
            temp/=10;
        }
        System.out.println(rev);
    }
}
