class Solution:
    def maxSubArray(self, nums: List[int]) -> int:
        res = nums[0]
        curSum = 0

        for n in nums:
            curSum = max(n, n + curSum)
            res = max(res, curSum)
        return res
        