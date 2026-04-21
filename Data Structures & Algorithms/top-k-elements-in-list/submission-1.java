class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        List<Integer>[] freq = new List[nums.length + 1];
        Map<Integer, Integer> count = new HashMap<>();

        for (int i = 0; i < freq.length; i++){
            freq[i] = new ArrayList<Integer>();
        }
        
        for (int i : nums){
            count.put(i, count.getOrDefault(i, 0) + 1);
        }

        for (Map.Entry<Integer, Integer> entry: count.entrySet()) {
            int num = entry.getKey();
            int value = entry.getValue();
            freq[value].add(num);
        } 

        int[] topK = new int[k];
        int index = 0; 
        for (int i = freq.length - 1; i > 0 && index < k; i--){
            for(int j : freq[i]) {
                topK[index++] = j;
                if(index == k){
                    return topK;
                }
            }
        }
        return topK;
    }
}

