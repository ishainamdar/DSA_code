public class pattern13 {
    public static void main(String[] args) {
        int num=1;
        for(int i=0;i<5;i++){
            for(int j=0;j<=i;j++){
                System.out.print(num++ + " ");
            }
            System.out.println();
        }
    }
}
