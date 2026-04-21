class Solution:
    def hasDuplicate(self, nums: List[int]) -> bool:
        dupl = {}
        for n in nums:
            if n in dupl:
                return True
            else:
                dupl[n] = 1
        return False
        