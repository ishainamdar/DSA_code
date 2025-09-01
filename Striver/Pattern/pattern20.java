public class pattern20{
    public static void main(String[] args) {
        int n=5;
        int num=n*2;
        int num2=n;
        for(int i=1;i<n*2;i++){
            
            if(i<=5){
            num=num-2;
                for(int j=0;j<i;j++){
                System.out.print("*");
            }
            for(int sp=num;sp>0;sp--){
                System.out.print(" ");
            }
            for(int j=i;j>0;j--){
                System.out.print("*");
            }
            }else{
            num=num+2;
            for(int j=num2-1;j>0;j--){
                System.out.print("*");
            }
            for(int sp=num;sp>0;sp--){
                System.out.print(" ");
            }
            
            for(int j=num2-1;j>0;j--){
                System.out.print("*");
            }
            --num2;
            }
            System.out.println();
            
        }
    }
}