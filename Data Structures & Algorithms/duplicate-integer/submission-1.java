class Solution {
    public boolean hasDuplicate(int[] nums) {
        Set<Integer> dupl = new HashSet<>();
        for (int i = 0; i < nums.length; i++){
            if (!(dupl.add(nums[i]))){
                return true;
            }
        }
        return false;
    }
} 