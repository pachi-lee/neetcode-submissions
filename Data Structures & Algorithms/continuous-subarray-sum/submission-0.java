class Solution {
    public boolean checkSubarraySum(int[] nums, int k) {
        if (nums.length == 1 && nums[0] % 6 != 0){
            return false; 
        } 
        for (int i = 0; i < nums.length; i++){
            int head = nums [i]; 
            int sum = head; 
            for (int j = i + 1; j < nums.length; j++){
                 sum += nums[j];
                if (sum % k == 0) return true;
            }

        }
        return false;
    }
}