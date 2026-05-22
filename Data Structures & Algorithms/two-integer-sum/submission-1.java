class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> set = new HashMap<Integer,Integer>();
        set.put(nums[0], 0);
        for(int i=1;i<nums.length;i++){
            int temp = target-nums[i];
            if(!set.containsKey(temp)){
                 set.put(nums[i],i);
            }
            else return new int[]{set.get(temp), i};
        }
        return new int[2];
    }
}
