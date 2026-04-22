class Solution:
    def lastStoneWeight(self, stones: List[int]) -> int:
        minHeap = [-x for x in stones]
        heapq.heapify(minHeap)

        while len(minHeap) > 1:
            x = abs(heapq.heappop(minHeap))
            y = abs(heapq.heappop(minHeap))
            if x > y:
                heapq.heappush(minHeap, -(x-y))

        return -minHeap[0] if minHeap else 0