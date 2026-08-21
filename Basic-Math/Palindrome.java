class Palindrome {
    public static void main(String[] args) {
        int x =12;
        int dup = x;     
        int rev = 0;     
        
        while(x>0){
            int rem = x % 10;
            rev = rev * 10 + rem;
            x = x/10;
        }                
       
        if(rev == dup){
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
    
}
