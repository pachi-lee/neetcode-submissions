class Solution {
    public int minOperations(int[] nums) {
        //count the nums and the amount of nums in the array 
        HashMap<Integer, Integer> number = new HashMap<>();

        for (int num : nums){
            number.put(num, number.getOrDefault(num, 0) + 1); 
        }
        int count = 0; 
        //traverse the map
           for (int val : number.values()) {
            if (val == 1) {
                return -1;
            }

             count += (val + 2) / 3;
        }
        return count; 
    }
}