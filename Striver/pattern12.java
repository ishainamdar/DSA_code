public class pattern12 {
    public static void main(String[] args) {
        int num=4;
        int temp=1;
        int temp2;
        for(int i=1;i<=4;i++){
            
            for(int j=1;j<=i;j++){
                System.out.print(j);
            }
            for(int sp=0;sp<=num;sp++){
                System.out.print(" ");
            }
            temp2=temp;
            for(int j=1;j<=i;j++){
                System.out.print(temp2);
                --temp2;
            }
            temp++;

            System.out.println();
            num=num-2;

        }
    }
}
