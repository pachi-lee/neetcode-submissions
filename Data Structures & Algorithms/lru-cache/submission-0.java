
class LRUCache {
    int[][] lruCache;
    int[] usage;
    int size;
    int count;

    public LRUCache(int capacity) {
        lruCache = new int[capacity][2];
        usage = new int[capacity];
        size = capacity;
        count = 0;
    }

    public int get(int key) {

        for (int i = 0; i < count; i++) {
            if (lruCache[i][0] == key) {

                // Update usage order
                for (int j = 0; j < count; j++) {
                    if (usage[j] == i) {
                        for (int k = j; k < count - 1; k++) {
                            usage[k] = usage[k + 1];
                        }
                        break;
                    }
                }

                usage[count - 1] = i;

                return lruCache[i][1];
            }
        }

        return -1;
    }

    public void put(int key, int value) {

        // Check if key already exists
        for (int i = 0; i < count; i++) {
            if (lruCache[i][0] == key) {
                lruCache[i][1] = value;

                // Move to most recently used
                for (int j = 0; j < count; j++) {
                    if (usage[j] == i) {
                        for (int k = j; k < count - 1; k++) {
                            usage[k] = usage[k + 1];
                        }
                        break;
                    }
                }

                usage[count - 1] = i;
                return;
            }
        }

        // If cache is full, replace LRU
        if (count == size) {
            int lruIndex = usage[0];

            lruCache[lruIndex][0] = key;
            lruCache[lruIndex][1] = value;

            for (int i = 0; i < count - 1; i++) {
                usage[i] = usage[i + 1];
            }

            usage[count - 1] = lruIndex;
        }
        else {
            lruCache[count][0] = key;
            lruCache[count][1] = value;

            usage[count] = count;
            count++;
        }
    }
}
