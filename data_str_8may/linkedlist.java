package data_str_8may;

public class linkedlist {
    Node head;
    static class Node{
        int value;
        Node next;

        public Node(int d) {
            value = d;
            next = null;
        }
    }

    public void addAtEnd(int val) {
        Node node = new Node(val);
        if(head==null) {
            head = node;
        } else {
            Node temp=head;
            while(temp.next!=null) {
                temp = temp.next;
            }
            temp.next = node;
        }
    }

    public void addAtBeginning(int val) {
        Node node = new Node(val);
        if(head == null) {
            head = node;
        } else {
            Node temp = head;
            head = node;
            head.next = temp;
        }
    }

    public void addAtMiddle(int val, int pos) {
        Node temp = head;
        Node temp2;
        Node node = new Node(val);
        int count = 1;
        while(count<pos) {
            temp = temp.next;
            count++;
        }
        temp2=temp.next;
        temp.next = node;
        node.next = temp2;
    }

    public void deleteAtEnd() {
        if(head==null) {
            System.out.println("List is empty");
        } else {
            Node temp = head;

            while(temp.next.next!=null) {
                temp=temp.next;
            }
            temp.next=null;
        }
    }

    public void deleteAtMiddle(int key) {
        if(head == null) {
            System.out.println("List is empty");
        } else {
            Node temp = head;
            while(temp.next.value!=key) {
                temp=temp.next;
            }
            if(temp.next==null) {
                System.out.println("Key not found");
            } else {
                temp.next = temp.next.next;
            }
        }
    }

    public void deleteAtBeginning() {
        Node temp = head;
        head = temp.next;
    }

    public void sortList() {
        Node temp = head;
        Node index = null;
        int t;

        if(head == null) {
            System.out.println("List is empty");
        } else {
            while(temp!=null) {
                index = temp.next;
                while(index!=null) {
                    if(temp.value>index.value) {
                        t = temp.value;
                        temp.value = index.value;
                        index.value = t;
                    }
                    index = index.next;
                }
                temp=temp.next;
            }
        }
    }

    public int searchList(int k) {
        int count = 0;
        Node temp = head;
        while(temp!=null) {
            if(temp.value==k)
                return count;
            count++;
            temp=temp.next;
        }
        return -1;
    }

    public void displayList() {
        Node temp=head;
        while(temp!=null) {
            System.out.print(temp.value+" ");
            temp=temp.next;
        }
    }

    public static void main(String[] args) {
        linkedlist ll = new linkedlist();
        ll.head = new Node(1);
        ll.addAtEnd(5);
        ll.addAtEnd(10);
        ll.addAtBeginning(2);
        ll.addAtMiddle(4, 2);
        System.out.println(ll.searchList(5));
        ll.sortList();
        ll.displayList();
    }
}
