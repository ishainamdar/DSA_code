public class GCD_num {
    public static void main(String[] args) {
        int n1=20;
        int n2=15;
        int min=0;
        int max=0;
        if(n1>n2){
            min=n2;
        }
        else{
            min=n1;
        }
        for(int i=1;i<min;i++){
            if(n1%i==0 && n2%i==0){
                if(i>max){
                    max=i;
                }
            }
        }
        System.out.println("GCD is "+max);
    }
}
