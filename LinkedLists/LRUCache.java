package LinkedLists;

import java.util.HashMap;
import java.util.Map;

class LRUCache {
    Node head = new Node(0,  0);
    Node tail = new Node(0, 0);
    Map<Integer, Node> map = new HashMap<>();
    private int capacity;

    public LRUCache(int capacity) {
        this.capacity = capacity;
        head.next = tail;
        tail.prev = head;
    }
    
    public int get(int key) {
        if (map.get(key) != null) {
            Node pair = map.get(key);
            int ans = pair.value;
            delete(pair);
            addToHead(pair);
            return ans;
        } else {
            return -1;
        }
    }
    
    public void put(int key, int value) {
        if (map.containsKey(key)) {
            Node node = map.get(key);
            delete(node);
            map.remove(key);
        }

        if (map.size() == capacity) {
            map.remove(tail.prev.key);
            delete(tail.prev);
        }

        addToHead(new Node(key, value));
        map.put(key, head.next);
    }

    public void delete(Node node) {
        node.next.prev = node.prev;
        node.prev.next = node.next;
    }

    public void addToHead(Node node) {
        node.next = head.next;
        node.prev = head;
        node.next.prev = node;
        head.next = node; 
    }

    class Node {
        Node prev, next;
        int key, value;
        Node(int key, int value) {
            this.key = key;
            this.value = value;
        }
    }
}


/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */
