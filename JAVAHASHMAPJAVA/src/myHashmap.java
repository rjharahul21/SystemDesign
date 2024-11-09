public class myHashmap<K, V> {

    public static final int INITILIZE_SIZE =  1 << 4;
    public static final int MAXIMUM_CAPACITY = 1 << 30;

    public Entry[] hashTable;

    public myHashmap() {
        hashTable = new Entry[INITILIZE_SIZE];
    }

    public myHashmap(int capacity) {
        int tableSize = tableSizeFor(capacity);
        hashTable = new Entry[tableSize];
    }

    int tableSizeFor(int n) {
        n = n - 1;
        n |= n >> 1;
        n |= n >> 2;
        n |= n >> 4;
        n |= n >> 16;
        return (n < 0) ? 1 : (n >= MAXIMUM_CAPACITY) ? MAXIMUM_CAPACITY : n + 1;
    }

    class Entry<K, V> {
        public K key;
        public V value;
        public Entry next;

        Entry(K k, V v) {
            key = k;
            value = v;
        }
    }

    public void put(K key, V value) {
        int hashCode = key.hashCode() % hashTable.length;
        Entry node = hashTable[hashCode];

        if(node == null) {
            Entry newNode = new Entry<K,V>(key, value);
            hashTable[hashCode] = newNode;
        } else {
            Entry prevNode = node;
            while(node != null) {
                if(node.key == key) {
                    node.value = value;
                    return;
                }
                prevNode = node;
                node = node.next;
            }
            Entry newEntry = new Entry<K,V>(key, value);
            prevNode.next = newEntry;
        }
    }

    public V get(K key) {
        int hashCode = key.hashCode() % hashTable.length;
        Entry node = hashTable[hashCode];

        while (node != null) {
            if(node.key == key) {
                return (V) node.value;
            }
            node = node.next;
        }
        return null;
    }
}