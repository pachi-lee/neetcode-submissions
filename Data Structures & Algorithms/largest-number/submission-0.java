public class Solution {
    public String largestNumber(int[] nums) {
        String[] arr = Arrays.stream(nums).mapToObj(String::valueOf).toArray(String[]::new);
        Arrays.sort(arr, (a, b) -> (b + a).compareTo(a + b));
        String res = String.join("", arr);
        return res.charAt(0) == '0' ? "0" : res;
    }
}