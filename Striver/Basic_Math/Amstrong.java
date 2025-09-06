import java.lang.Math;
public class Amstrong {
    public static void main(String[] args) {
        int N=-153;
        int temp=N;
        int sum=0;
        int k = String.valueOf(N).length();
        while(temp>=0){
            sum=sum+((int)Math.pow((temp%10),k));
            temp/=10;
        }
        if(N==sum){
            System.out.println(true);
        }else{
            System.out.println(false);
        }
        
    }
}
