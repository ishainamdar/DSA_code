public class pattern15 {
    public static void main(String[] args) {
        for(int i=5;i>0;i--){
            char ch='A';
            for(int j=i;j>0;j--){
                System.out.print(ch++ + " ");
            }
            System.out.println();
        }
    }
}
