public class PrimeNum {
    public static void main(String[] args) {
        int N=29;
        int cnt=0;
        for(int i=1;i<=N;i++){
            if(N%i==0){
                cnt++;
            }
        }
        if(cnt==2){
            System.out.println("Number is prime");
        }else{
            System.out.println("Number is not prime");
        }
    }
}
