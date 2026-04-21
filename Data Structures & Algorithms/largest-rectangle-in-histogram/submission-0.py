class Solution:
    def largestRectangleArea(self, heights: List[int]) -> int:
        maxArea = 0
        stack = [] # Will be adding pairs of starting index and height (i, h)
        
        for currIndex, height in enumerate(heights):
            startingIndex = currIndex
            while stack and stack[-1][1] > height:
                i, h = stack.pop()
                maxArea = max(maxArea, h * (currIndex - i))
                startingIndex = i
            stack.append((startingIndex, height))

        for i, h in stack:
            maxArea = max(maxArea, h * (len(heights) - i))

        return maxArea