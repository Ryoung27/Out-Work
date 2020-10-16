class Solution:
    def runningSum(self, nums: List[int]) -> List[int]:
        answer = []
        l = 0
        for i in nums:
            l = l + i
            answer.append(l)
        return answer