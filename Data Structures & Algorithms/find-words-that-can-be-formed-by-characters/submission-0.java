public class Solution {
    public int countCharacters(String[] words, String chars) {
        Map<Character, Integer> count = new HashMap<>();
        for (char c : chars.toCharArray()) {
            count.put(c, count.getOrDefault(c, 0) + 1);
        }
        int res = 0;
        for (String w : words) {
            Map<Character, Integer> curWord = new HashMap<>();
            boolean good = true;
            for (char c : w.toCharArray()) {
                curWord.put(c, curWord.getOrDefault(c, 0) + 1);
                if (curWord.get(c) > count.getOrDefault(c, 0)) {
                    good = false;
                    break;
                }
            }
            if (good) {
                res += w.length();
            }
        }
        return res;
    }
}