package LinkedList;

class Node {
    int val;
    Node next;
    Node(int x) {
        val = x;
        next = null;
    }
}

public class LinkedListCycle {
    public static void main(String[] args) {
        Node head = new Node(3);
        Node node2 = new Node(2);
        Node node3 = new Node(0);
        Node node4 = new Node(-4);

        head.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node2;
        
        LinkedListCycle detector = new LinkedListCycle();
        Node cycleStart = detector.HasCycle(head);
        
        if (cycleStart != null) {
            // Simply map the node references to their respective position indexes
            if (cycleStart == head) System.out.println(0);
            else if (cycleStart == node2) System.out.println(1);
            else if (cycleStart == node3) System.out.println(2);
            else if (cycleStart == node4) System.out.println(3);
        } else {
            System.out.println(-1);
        }
    }

    public Node HasCycle(Node head) {
        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (fast == slow) {
                slow = head;
                while (slow != fast) {
                    slow = slow.next;
                    fast = fast.next;
                }
                return slow; 
            }
        }
        return null; 
    }
}
