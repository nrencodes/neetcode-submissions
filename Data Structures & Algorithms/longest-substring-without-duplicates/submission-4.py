class Solution:
    def lengthOfLongestSubstring(self, s: str) -> int:
        l = 0
        res = 0
        uniqueChars = set()

        for r in range(len(s)):
            while s[r] in uniqueChars:
                uniqueChars.remove(s[l])
                l += 1
            uniqueChars.add(s[r])
            res = max(res, r - l + 1)

        return res
            


        


        