public class pattern19 {
    public static void main(String[] args) {
        int n=5;
        int num=8;
        for(int i=0;i<n*2;i++){
            if(i<n){
                 for(int j=0;j<n-i;j++){
                System.out.print("*");
            }
            for(int k=0;k<i*2;k++){
                System.out.print(" ");
            }
            for(int j=0;j<n-i;j++){
                System.out.print("*");
            }
            }
            else{
            for(int j=i-n;j>=0;j--){ //i=5
                System.out.print("*");
            }
            for(int sp=num;sp>0;sp--){ //8,6,4,2,0 i=5->8 i=6->6  i=7->4 i
                System.out.print(" ");
            }
            for(int j=0;j<=i-n;j++){
                System.out.print("*");
            }
            num=num-2;
            }
            
            System.out.println();
            
        }
    }
}
