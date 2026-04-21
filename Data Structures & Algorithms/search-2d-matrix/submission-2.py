class Solution:
    def searchMatrix(self, matrix: List[List[int]], target: int) -> bool:
        rows, cols = len(matrix), len(matrix[0])
        l, r = 0, rows * cols - 1
        while l <= r:
            m = l + ((r-l) // 2)
            # to get the row you integer divide by number of columns
            # the remainder is the column position
            row, col = m // cols, m % cols
            print(matrix[row][col])
            if target > matrix[row][col]:
                l = m + 1
            elif target < matrix[row][col]:
                r = m - 1
            else:
                return True

        return False