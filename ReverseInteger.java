class ReverseInteger {
    public int reverse(int x) {
        
         // check if the number is 32 bit
        if(x > Integer.MAX_VALUE || x < Integer.MIN_VALUE){
            return 0;
        }
        
        boolean isNegative= false;
        
        // check if the number is negative
        if(x<0){
            x *= (-1);
            isNegative = true;
        }
        long reverse=0;
        
        // Extracting each digit and adding it to the reverse variable
        while(x>0){
            
            int extractDigit = x%10;
            reverse = reverse*10 + (long)extractDigit;
            x = x/10;
            
            // check if there is an integer overflow
             if(reverse > Integer.MAX_VALUE || reverse < Integer.MIN_VALUE){
            return 0;
        }
        }
        
        // if the number was negative multiply it again with -1
        if(isNegative){
           reverse *= (-1); 
        }
        
        return (int)reverse;
        
    }
}