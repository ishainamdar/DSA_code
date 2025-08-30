public class pattern21 {
    public static void main(String[] args) {
        int n=4;
        int num=0;
        int num2=1;
        for(int i=n;i>0;i--){
            if(i>2){
            for(int j=i/2;j>0;j--){
                    System.out.print("*");
            }
            for(int sp=0;sp<num;sp++){
                System.out.print(" ");
            }
            for(int j=i/2;j>0;j--){
                    System.out.print("*");
            }
            num=num+2;
        }
            else{
            num=num-2;
               // System.out.println(num);//2-4 num->
            for(int j=num2;j>0;j--){  //i=2->4 i=1 4/2 =2-2=0 num=2 
                    System.out.print("*");
            }
            for(int sp=num;sp>0;sp--){
                System.out.print(" ");
            }
            for(int j=num2;j>0;j--){
                    System.out.print("*");// i=1 4/1=4-2=2
            }
            //num=num+2;
            num2=num2+1;
            }
            System.out.println();  
            
        }
               
    }
}

