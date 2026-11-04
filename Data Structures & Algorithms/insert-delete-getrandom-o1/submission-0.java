public class RandomizedSet {
    private Map<Integer, Integer> numMap;
    private List<Integer> nums;
    private Random rand;

    public RandomizedSet() {
        numMap = new HashMap<>();
        nums = new ArrayList<>();
        rand = new Random();
    }

    public boolean insert(int val) {
        if (numMap.containsKey(val)) return false;
        numMap.put(val, nums.size());
        nums.add(val);
        return true;
    }

    public boolean remove(int val) {
        if (!numMap.containsKey(val)) return false;
        int idx = numMap.get(val);
        int last = nums.get(nums.size() - 1);
        nums.set(idx, last);
        numMap.put(last, idx);
        nums.remove(nums.size() - 1);
        numMap.remove(val);
        return true;
    }

    public int getRandom() {
        return nums.get(rand.nextInt(nums.size()));
    }
}