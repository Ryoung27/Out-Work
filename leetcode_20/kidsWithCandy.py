class Solution:
    def kidsWithCandies(self, candies: List[int], extraCandies: int) -> List[bool]:
        answer = []
        max_candies = max(candies) - extraCandies
        for i in candies:
            answer.append(i >= max_candies)
        return answer