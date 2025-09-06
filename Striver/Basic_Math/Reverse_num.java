//int chya range madhech number reverse zhala pahije
class Reverse_num{
    public static void main(String[] args) {
        int x=12345;
        long rev = 0; // use long to catch overflow safely
        while (x != 0) {
            rev = rev * 10 + x % 10;
            x /= 10;
        }
        // check if result is out of int range
        if (rev > Integer.MAX_VALUE || rev < Integer.MIN_VALUE) {
           System.out.println("out of range");
        }
        else{
            System.out.println((int)rev);
        }
        
    }
  
        
}
