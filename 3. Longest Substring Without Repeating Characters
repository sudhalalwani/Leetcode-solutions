class Solution {
    public int lengthOfLongestSubstring(String s) {
        int result = 0;
        int i = 0;
        
        if(s.length() == 0){
            return 0;
        }
        else if(s.length() == 1){
            result = 1;
            return result;
        }else{
        
            while(i< s.length()){

                String str = "";
                str = str + s.charAt(i);
                int flag = 0, j = i+1;
                while(j<s.length() && flag == 0){
                    char ch = s.charAt(j);
                    String temp = "";
                    temp += ch;
                    if(str.contains(temp) == false){

                        str += s.charAt(j);

                    }else{

                        if(str.length() >= result){
                            result = str.length();

                        }
                        flag = 1;
                    }
                    j++;

                    if(j >=s.length() && flag == 0){
                        if(str.length() >= result){
                            result = str.length();
                        }
                    }

                }
                i++;
            }
            return result;
        }
    }
}