class Solution {
    public String convert(String s, int n) {
        String[] res = new String[n];
        int i =0;
        Arrays.fill(res, "");
        
        while(i< s.length()){
            int j = 0;
            
            while(j< n && i< s.length()){
                res[j] += s.charAt(i);
                i++;
                j++;
            }
            
            j = n-2;
            while(j>0 && i<s.length()){
                res[j] += s.charAt(i);
                i++;
                j--;
            }
        }
        
        String result = "";
        
        for(int a = 0; a<n; a++){
            result += res[a];
        }
        
        return result;
    }
}