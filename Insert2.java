package Doublylinkedlist;
;

public class Insert2 {

    public void insertAtBegan(DoubleLinkedList node, int insertvalue) {
        while (node.prev != null) {
            node = node.prev;
        }
        DoubleLinkedList temp = new DoubleLinkedList(insertvalue);
        temp.next = node;
        node.prev = temp;
    }

    public void insertAtEnd(DoubleLinkedList node, int insertvalue) {
        while (node.next != null) {
            node = node.next;
        }
        DoubleLinkedList temp = new DoubleLinkedList(insertvalue);
        node.next = temp;
        temp.prev = node;
    }

    public void traverseForward(DoubleLinkedList node) {
        while (node.prev != null) {
            node = node.prev;
        }
        while (node != null) {
            System.out.print(node.val + "  ");
            node = node.next;
        }
        System.out.println("null");
    }

    public void traverseBackward(DoubleLinkedList node) {
        while (node.next != null) {
            node = node.next;
        }
        while (node != null) {
            System.out.print(node.val + "  ");
            node = node.prev;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        DoubleLinkedList l1 = new DoubleLinkedList(67);
        DoubleLinkedList l2 = new DoubleLinkedList(17);
        DoubleLinkedList l3 = new DoubleLinkedList(37);
        DoubleLinkedList l4 = new DoubleLinkedList(57);

        l1.next = l2;
        l2.prev = l1;
        l2.next = l3;
        l3.prev = l2;
        l3.next = l4;
        l4.prev = l3;

        Insert2 demo = new Insert2();
        demo.insertAtBegan(l1, 5);
        demo.insertAtEnd(l4, 99);

        demo.traverseForward(l1);
        demo.traverseBackward(l4);
    }
}
