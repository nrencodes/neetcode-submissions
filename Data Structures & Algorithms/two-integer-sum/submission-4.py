class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        diffs = {}
        for i, n in enumerate(nums):
            if n in diffs:
                diffs[n].append(i)
            else:
                diffs[n] = [i]
        print(diffs) 
        for i, n in enumerate(nums):
            diff = target - n
            if diff in diffs and diffs[diff][0] != i:
                if len(diffs[diff]) > 1:
                    return [int(diffs[diff][0]), int(diffs[diff][1])]
                else: 
                    return [i, diffs[diff][0]]