class TimeMap:

    def __init__(self):
        self.structure = defaultdict(list)

    def set(self, key: str, value: str, timestamp: int) -> None:
        self.structure[key].append([value, timestamp])

    def get(self, key: str, timestamp: int) -> str:
        key_list = self.structure[key]
        print(key_list)
        for i in range(len(self.structure[key]) - 1, -1, -1):
            val, time = key_list[i][0], key_list[i][1]
            if time <= timestamp:
                return val

        return ""
