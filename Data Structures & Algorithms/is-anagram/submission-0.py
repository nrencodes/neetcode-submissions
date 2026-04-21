class Solution:
    def isAnagram(self, s: str, t: str) -> bool:
        duplS = {}
        for n in s:
            if n in duplS:
                duplS[n] += 1
            else:
                duplS[n] = 1

        duplT = {}
        for n in t:
            if n in duplT:
                duplT[n] += 1
            else:
                duplT[n] = 1
        
        return duplT == duplS