class Solution {
    public String shiftingLetters(String s, int[][] shifts) {
        int n = s.length();
        int[] diff = new int[n + 1];

        // Record the shifts
        for (int[] shift : shifts) {
            int start = shift[0];
            int end = shift[1];
            int dir = shift[2];

            int amount = (dir == 1) ? 1 : -1;

            diff[start] += amount;
            diff[end + 1] -= amount;
        }

        char[] chars = s.toCharArray();
        int totalShift = 0;

        // Apply the shifts
        for (int i = 0; i < n; i++) {
            totalShift += diff[i];

            int newChar = (chars[i] - 'a' + totalShift) % 26;

            if (newChar < 0) {
                newChar += 26;
            }

            chars[i] = (char) ('a' + newChar);
        }

        return new String(chars);
    }
}