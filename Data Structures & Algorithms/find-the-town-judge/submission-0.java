class Solution {
    public int findJudge(int n, int[][] trust) {
        // Net trust score for each person (1-indexed)
        int[] trustScores = new int[n + 1];

        for (int[] pair : trust) {
            int personA = pair[0]; // trusts someone
            int personB = pair[1]; // is trusted

            trustScores[personA]--; // A trusts B, so A cannot be judge
            trustScores[personB]++; // B gains trust
        }

        for (int i = 1; i <= n; i++) {
            if (trustScores[i] == n - 1) {
                return i;
            }
        }

        return -1;
    }
}