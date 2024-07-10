import java.io.*;
import java.util.*;


class Array {
    
    // Driver code
	public static void main (String[] args) throws IOException{
		// Taking input using buffered reader
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int testcases = Integer.parseInt(br.readLine());
		
		// looping through all testcases
		while(testcases-- > 0){
		    String line = br.readLine();
		    String[] element = line.trim().split("\\s+");
		    int sizeOfArray = Integer.parseInt(element[0]);
		    int K = Integer.parseInt(element[1]);
		    
		    int arr [] = new int[sizeOfArray];
		    
		    line = br.readLine();
		    String[] elements = line.trim().split("\\s+");
		    for(int i = 0;i<sizeOfArray;i++){
		        arr[i] = Integer.parseInt(elements[i]);
		    }
		    
		    Solution obj = new Solution();
		    int res = obj.lenOfLongSubarr(arr, sizeOfArray, K);
		    
		    System.out.println(res);
		}
	}
}

class Solution{
    
   
    // Function for finding maximum and value pair
    public int lenOfLongSubarr (int A[], int N, int K) {
        Map<Integer, Integer> prefixSumidx = new HashMap<>();
        int prefixSum = 0;
        int ans = 0;
        prefixSumidx.put(0,0);
        for(int i =0; i< N; i++){
            prefixSum += A[i];
            if(prefixSumidx.containsKey(prefixSum-K)){
                int value = (i+1)-prefixSumidx.get(prefixSum-K);
                ans = Math.max(ans, value);
            }
            if(prefixSumidx.containsKey(prefixSum)){
                int v = Math.min(prefixSumidx.get(prefixSum), i+1);
                prefixSumidx.put(prefixSum, v);
            }else{
                prefixSumidx.put(prefixSum, i+1);
            }
            
            
        }
        return ans;
    }
    
    
}


