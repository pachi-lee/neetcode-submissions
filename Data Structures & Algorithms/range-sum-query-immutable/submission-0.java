class NumArray {
    private int [] copy; 
    public NumArray(int[] nums) {
        this.copy = new int [nums.length]; 

        for (int i = 0; i < nums.length; i++){
            copy [i] = nums [i]; 
        }
    }
    
    public int sumRange(int left, int right) {
        int sum = 0; 
        while (left<=right){
            sum += copy[left];
            left++; 
        }
        return sum; 
    }
}

/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * int param_1 = obj.sumRange(left,right);
 */