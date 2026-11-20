public class Solution {
    public int[] sortJumbled(int[] mapping, int[] nums) {
        int n = nums.length;
        int[][] pairs = new int[n][2];

        for (int i = 0; i < n; i++) {
            int mapped_n = 0, base = 1;
            int num = nums[i];

            if (num == 0) {
                mapped_n = mapping[0];
            } else {
                while (num > 0) {
                    int digit = num % 10;
                    num /= 10;
                    mapped_n += base * mapping[digit];
                    base *= 10;
                }
            }

            pairs[i][0] = mapped_n;
            pairs[i][1] = i;
        }

        Arrays.sort(pairs, (a, b) -> Integer.compare(a[0], b[0]));

        int[] res = new int[n];
        for (int i = 0; i < n; i++) {
            res[i] = nums[pairs[i][1]];
        }

        return res;
    }
}