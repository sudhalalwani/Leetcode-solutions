class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n = nums1.length;
        int m = nums2.length;
        int[] arr = new int[n+m];
        int i = 0, j= 0, k=0;
        while(i<n && j<m){
            if(nums1[i] < nums2[j]){
                arr[k] = nums1[i];
                k++;
                i++;
            }else if(nums1[i] > nums2[j]){
                arr[k] = nums2[j];
                k++;
                j++;
            }else{
                arr[k] = nums1[i];
                i++;
                k++;
                arr[k] = nums2[j];
                j++;
                k++;
            }
        }
        
        while(i<n){
            arr[k] = nums1[i];
            i++;
            k++;
        }
        while(j<m){
            arr[k] = nums2[j];
            k++;
            j++;
        }
        
        // for(int s =0 ; s< arr.length; s++){
        //     System.out.println(arr[s]);
        // }
        int mid = (n+m-1) / 2;
        //System.out.println(mid);
        double ans = 0;
        
        if((n+m)%2 == 0){
            int low = mid;
            int high = mid+1;
            
            ans = (((double)arr[low]+(double)arr[high])/2);
            //System.out.println("hello");
        }else{
            //System.out.println(mid);
            ans = arr[mid];
        }
        
        return ans;
    }
}