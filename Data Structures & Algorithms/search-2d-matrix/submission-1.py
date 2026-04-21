class Solution:
    def searchMatrix(self, matrix: List[List[int]], target: int) -> bool:
        left, right = 0, len(matrix) - 1
        row = -1
        while left <= right:
            mid = (left + right) // 2
            curr = matrix[mid][0]
            if curr > target:
                right = mid - 1
            elif curr < target:
                left = mid + 1
                for i in matrix[mid]:
                    if i == target:
                        return True
            else:
                return True
        
        return False
        
        