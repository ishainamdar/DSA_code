public class pattern8 {
    public static void main(String[] args) {
        int n=5;
        for(int i=1;i<=5;i++){
            for(int sp=1;sp<i;sp++){
                System.out.print(" ");
            }
            for(int j=n*2-1;j>=1;j--){
                System.out.print("*");
                
            }
            n--;
            System.out.println();
        }
    }
}
