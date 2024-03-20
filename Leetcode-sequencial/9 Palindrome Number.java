class Solution {
    public boolean isPalindrome(int num) {
        if(num < 0){
            return false;
        }
        int rev = 0;
        int n = num;
        while(num > 0){
            int d = num%10;
            rev = (rev*10) + d;
            num = num/10;
        }
        
        if(rev == n){
            return true;
        }else{
            return false;
        }
    }
}