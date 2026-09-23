class Solution(object):
    def minSubArrayLen(self, target, nums):
        """
        :type target: int
        :type nums: List[int]
        :rtype: int
        """
        n = len(nums)
        left = 0
        currSum = 0
        minLen = sys.maxsize
        
        for i in range(0, n):
            currSum += nums[i]
            
            while(currSum >= target):
                length = i - left + 1
                minLen = min(length, minLen)
                currSum -= nums[left]
                left += 1
                
        if(minLen == sys.maxsize): return 0
        return minLen