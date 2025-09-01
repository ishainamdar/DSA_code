//pending
public class pattern22_pending {
   public static void main(String[] args) {
        int n=4;
        
        int num=n*2;
        int num2=n;
        for(int i=1;i<n*2;i++){
            
            if(i<5){
            int temp1=5;
            num=num-2;
                for(int j=0;j<i;j++){
                System.out.print(--temp1);
            }
            for(int sp=num;sp>0;sp--){
                System.out.print(temp1);
            }
            //++temp1;
            for(int j=i;j>0;j--){
                System.out.print(temp1++);
            }
            }else{
            int temp1=5;
            num=num+2;
            for(int j=num2-1;j>0;j--){
                System.out.print(--temp1);
            }
            for(int sp=num;sp>0;sp--){
                System.out.print(temp1);
            }
            //--temp1;
            for(int j=num2-1;j>0;j--){
                System.out.print(temp1++);
            }
            --num2;
            }
            System.out.println();
            
        }
    }
}
