class Solution:
    def zeroFilledSubarray(self, nums: List[int]) -> int:
        
        total = 0
        curr = 0

        for num in nums:

            if num == 0:
                curr += 1
            else:
                total += ((curr) * (curr + 1)) // 2
                curr = 0 
        
        return total + (curr * (curr + 1)) // 2