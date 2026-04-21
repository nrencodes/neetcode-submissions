class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> numsCopy = new HashSet<>();
        for(int n : nums){
            numsCopy.add(n);
        }

        int longestSequence = 0;
        for (int n: nums){
            if(!numsCopy.contains(n-1)){
                int sequenceLength = 1;
                int curr = n;
                while(numsCopy.contains(curr+1)){
                    curr++;
                    sequenceLength++;

                }
                longestSequence = Math.max(longestSequence, sequenceLength);
            } 
        }

        return longestSequence;
    }
}
