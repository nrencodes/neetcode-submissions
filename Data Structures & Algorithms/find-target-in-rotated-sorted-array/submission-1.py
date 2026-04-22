class Solution:
    def search(self, nums: List[int], target: int) -> int:
        l, r = 0, len(nums)-1
        while l<=r:
            m = l + ((r-l)//2)
            if target == nums[m]: 
                return m
            
            # left is the sorted ascending
            if nums[l] <= nums[m]:
                # Not this side: target less than left or target greater than mid point
                if target < nums[l] or target > nums[m]:
                    l = m + 1
                else:
                    r = m - 1

            # right is the sorted ascending
            else:
                # [5,6,0,1,2,3,4]
                # Not this side: target greater than right or target less than mid point
                if target > nums[r] or target < nums[m]:
                    r = m - 1
                else:
                    l = m + 1
            
        return -1