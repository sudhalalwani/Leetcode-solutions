import java.math.*;
class Solution {
    public int myAtoi(String s) {
    String str = "";
		s = s.trim().toLowerCase();
		boolean flag = true;

		if(s.isEmpty()) {
			return 0;
		}

		if('a' <= s.charAt(0) && 'z' >= s.charAt(0)) {
			return 0;
		}
		
		if(s.length() > 1 ) {
			if((s.charAt(0) == '+' && s.charAt(1) == '-') || (s.charAt(1) == '+' && s.charAt(0) == '-')){
				return 0;
			}
		}
		

		if(s.charAt(0) == '.') {
			return 0;
		}

		for(char c:s.toCharArray()) {
			if(Character.isDigit(c)) {
				str = str+String.valueOf(c);
				s = str;
			}
			else {
				if(flag && (s.charAt(0) == '+' ||  s.charAt(0) == '-')){
					str = str+String.valueOf(c);
					s = str;
					flag = false;
				}
				else {
					break;
				}
			}
		}
        
        if(s.length() == 1 ) {
			if(s.charAt(0) == '+' ||  s.charAt(0) == '-'){
				return 0;
			}
		}
        
		BigInteger bi = new BigInteger(s);
        
		if(BigInteger.valueOf(Integer.MAX_VALUE).compareTo(bi) == -1) {
			return Integer.MAX_VALUE;
		}
        
		if(BigInteger.valueOf(Integer.MIN_VALUE).compareTo(bi) == 1) {
			return Integer.MIN_VALUE;
		}
		return Integer.parseInt(s);

    }
}