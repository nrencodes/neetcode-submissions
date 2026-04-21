class Solution {
    public int[] productExceptSelf(int[] nums) {
        int product = 1;
        int zeroProduct = 1;
        int zeros = 0;

        for(int n : nums){
            product *= n; 
            if (n == 0){
                zeros++;
                continue;
            } else {
                zeroProduct *= n;
            }
        }

        if (zeros > 1) {
            return new int[nums.length];
        }

        int [] products = new int[nums.length];
        for(int i = 0; i < products.length; i++){
            System.out.println(nums[i]);
            if (nums[i] == 0){
                products[i] = zeroProduct;
            } else{
                products[i] = product/nums[i];
            }
        }    

        return products;
    }
}  
