class Solution {
    public int[] twoSum(int[] nums, int target) {
        LinkedHashMap<Integer,Integer> map=new LinkedHashMap<>();
     for (int i=0;i<nums.length;i++){
        int c=target-nums[i];
        if(map.containsKey(c) ){
            return new int[]{map.get(c),i};
        }else{
            map.put(nums[i],i);

        }
     }
        return new int[]{};
    }
}