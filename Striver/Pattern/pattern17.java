public class pattern17 {
    public static void main(String[] args) {
        
        for(int i=1;i<=5;i++){
            char ch='A';
            for(int sp=5-i;sp>=1;sp--){
                System.out.print(" ");
            }
            for(int j=1;j<=((i*2)-1);j++){
                if(i>j){
                    System.out.print(ch++);
                }
                else{
                    System.out.print(ch--);
                }
                
          
            }
            System.out.println();
        }
    }
}
