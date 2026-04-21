class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        diffs = {}
        for i, n in enumerate(nums):
                diffs[n] = [i]
 
        for i, n in enumerate(nums):
            diff = target - n
            if diff in diffs and diffs[diff][0] != i:
                    return [i, diffs[diff][0]]