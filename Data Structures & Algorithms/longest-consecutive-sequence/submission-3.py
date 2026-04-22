class Solution:
    def longestConsecutive(self, nums: List[int]) -> int:
        numbers = set(nums)
        res = 0
        for n in nums:
            curr = n
            currLength = 1
            while curr + 1 in numbers:
                currLength += 1
                curr += 1
            res = max(res, currLength)
        return res