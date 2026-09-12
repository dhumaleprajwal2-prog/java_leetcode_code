class Solution { 
    public int[] sortedSquares(int[] nums) { 

        int arr[] = new int[nums.length]; 
        int i = 0; 
        int j = nums.length - 1; 
        int k = 0, p = 0; 
        int s = nums.length - 1; 

        while(i <= j) { 

            k = nums[i] * nums[i]; 
            p = nums[j] * nums[j]; 

            if(k > p) { 
                arr[s] = k; 
               i++;
            } else { 
                arr[s] = p; 
                  j--; 
            } 

            s--; 
        } 

        return arr; 
    } 
}