public class Palindrome {
    public static void main(String[] args) {
        int N=4554;
        int temp=N;
        int rev=0;
        while(temp!=0){
            rev=rev*10+(temp%10);
            temp/=10;
        }
        if(rev==N){
            System.out.println("Is Palindrome");
        }
        else{
            System.out.println("Is No Palindrome");
        }
    }
}
