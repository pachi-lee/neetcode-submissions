class NumArray {
    private int [] numbers; 
    public NumArray(int[] nums) {
        //start from left to the right 
        numbers = new int [nums.length]; 

        //copy the array in 
        for (int i = 0; i < nums.length; i++){
            numbers[i] = nums[i]; 
        }


    }
    
    public int sumRange(int left, int right) {
        int sum = 0; 
        for (int l = left; l <= right; l++){
            sum += numbers[l];
        }
        return sum; 
    }
}

/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * int param_1 = obj.sumRange(left,right);
 */