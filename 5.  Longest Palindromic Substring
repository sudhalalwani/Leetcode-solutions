//BRUTE FORCE o(n3)
class Solutions{
    public static String longestPalindrome(String s) {
        int length = 1;
        String ans = "" + s.charAt(0);
        if(s.length() == 1){
            return s;
        }else{
            for(int i = 0; i< s.length(); i++){
                String temp = "" + s.charAt(i);
                for(int j = i+1; j< s.length(); j++){
                    temp += s.charAt(j);
                    if(isPalindrome(temp)){  
                        if(temp.length() > length){
                            length = temp.length();
                            ans = temp;
                        }
                    }
                }
            }
            return ans;
        }
    }
    
    public static boolean isPalindrome(String str){
        String temp = "";
        for(int i = str.length()-1; i>=0; i--){
            temp += str.charAt(i);
        }
        if(temp.equals(str)){
            return true;
        }else{
            return false;
        }
    }
}

// MODIFIED O(n2)

class Solution {
    public String longestPalindrome(String s) {
        if(s == null || s.length() < 1) return "";
        
        int start = 0;
        int end = 0;
        for(int i =0; i<s.length(); i++){
            int len1 = isPalindrome(s, i, i);
            int len2 = isPalindrome(s, i, i+1);
            int len = Math.max(len1, len2);
            if(len > end-start){
                start = i - ((len-1)/2);
                end  = i + (len/2);
            }
        }
        
        return s.substring(start, end+1);
    }
    
    public static int isPalindrome(String s, int left, int right){
        if(s.length()<1 || left > right) return 0;
        
        while(left >=0 && right < s.length() && s.charAt(left) == s.charAt(right)){
            left--;
            right++;
        }
        
        return right - left - 1;
    }
}