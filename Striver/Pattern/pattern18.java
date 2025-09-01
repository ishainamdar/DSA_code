public class pattern18 {
     public static void main(String[] args) {
        char ch='E';
        char ch2;
        for(int i=0;i<5;i++){
            ch2=ch;
            for(int j=0;j<=i;j++){
                System.out.print(ch2 + " ");
                ch2++;
            }
            ch--;
            System.out.println();
        }
    }
}
