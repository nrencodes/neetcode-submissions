class TimeMap:

    def __init__(self):
        self.structure = defaultdict(list)

    def set(self, key: str, value: str, timestamp: int) -> None:
        self.structure[key].append([value, timestamp])

    def get(self, key: str, timestamp: int) -> str:
        keyList = self.structure[key]
        l, r = 0, len(keyList) - 1
        res = ""
        while l <= r:
            m = (r + l) // 2
            currTime = keyList[m][1]
            if currTime > timestamp:
                r = m - 1
            else:
                res = keyList[m][0]
                l = m + 1
        return res
