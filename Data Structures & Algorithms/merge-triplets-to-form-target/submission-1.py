class Solution:
    def mergeTriplets(self, triplets: List[List[int]], target: List[int]) -> bool:
        good = []
        for triplet in triplets:
            if triplet[0] > target[0] or triplet[1] > target[1] or triplet[2] > target[2]:
                continue
            good.append(triplet)

        if not good:
            return False

        curTriplet = good[0]
        for triplet in good:
            if curTriplet == target:
                return True
            curTriplet[0] = max(triplet[0], curTriplet[0])
            curTriplet[1] = max(triplet[1], curTriplet[1])
            curTriplet[2] = max(triplet[2], curTriplet[2])

        return True if curTriplet == target else False