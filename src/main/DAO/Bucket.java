package main.DAO;

public class Bucket {
    Node head;

    public Bucket() {
        head = new Node(-1, -1);
    }

    private boolean contains(int key) {
        Node currNode = head;
        while (currNode != null) {
            if (currNode.key == key)
                return true;
            currNode = currNode.next;
        }
        return false;
    }

    public void remove(int key) {
        Node currNode = head;
        while (currNode != null) {
            if (currNode.next.key == key) {
                currNode.next = currNode.next.next;
                return;
            } else
                currNode = currNode.next;
        }
    }

    public void put(int key, int val) {
        if (contains(key))
            remove(key);
        Node newNode = new Node(key, val);
        newNode.next = head.next;
        head.next = newNode;
    }

    public int get(int key) {
        if (contains(key)) {
            Node currNode = head;
            while (currNode != null) {
                if (currNode.key == key)
                    return currNode.val;
                currNode = currNode.next;
            }
        }
        return -1;
    }
}
