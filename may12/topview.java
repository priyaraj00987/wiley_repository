package may12;

import java.util.LinkedList;
import java.util.Queue;
import java.util.TreeMap;

class Node {
    public int height;
    public Integer data;
    int val;
    Node left;
    Node right;

    Node() {
        this.val = val;
    }
}

class BinaryTree {

    public void topView(Node node) {
        if (node == null) {
            return;
        }

        TreeMap<Integer, Integer> m = new TreeMap<>();

        Queue<Node> q = new LinkedList<>();
        q.add(node);

        while (!q.isEmpty()) {
            Node temp = q.remove();
            int hd = temp.height;

            if (m.get(hd) == null) {
                m.put(hd, temp.data);
            }

            if (temp.left != null) {
                temp.left.height = hd - 1;
                q.add(temp.left);
            }

            if (temp.right != null) {
                temp.right.height = hd + 1;
                q.add(temp.right);
            }
        }
        System.out.println(m.values());
    }

    public Node createNewNode(int val) {
        Node newNode = new Node();
        newNode.data = val;
        newNode.left = null;
        newNode.right = null;
        return newNode;
    }
}

public class topview {
    public static void main(String[] args) {

        BinaryTree a = new BinaryTree();

        Node root = a.createNewNode(2);
        root.left = a.createNewNode(7);
        root.right = a.createNewNode(5);
        root.left.right = a.createNewNode(6);
        root.left.right.left = a.createNewNode(5);
        root.left.right.left.left = a.createNewNode(10);
        root.left.right.right = a.createNewNode(11);
        root.right.right = a.createNewNode(9);

        a.topView(root);
    }
}