package tree9may;public class binary_search_tree {
    static  class Node {
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data=data;
            this.left=null;
            this.right=null;
        }
    }
    static  Node insert(Node root,int val){
        if (root==null){
            root= new Node(val);
            return  root;
        }
        if(root.data>val){
            root.left= insert(root.left,val);
        }
        else{
            root.right=insert(root.right,val);
        }
        return root;
    }
    static void inorder(Node root){
        if(root==null){
            return;
        }
        inorder(root.left);
        System.out.println(root.data);
        inorder(root.right);
    }
    static  boolean search(Node root, int val){
        if(root==null){
            return false;
        }
        if(root.data==val){
            return true;
        }
        if(root.data>val){
            return search(root.left,val);
        }

        else {
            return search(root.right,val);
        }

    }
    //.......................................delete node..........................................//
    /* case 1. no child(leaf node)
     * (delete node  and return null to parent)
     * CASE 2. ONE CHILD
     *(delete node and replace with child node)
     * CASE 3. TWO CHILD
     * (replace value with inorder successor delete the node for inorder successor<always has 0 or 1 child>)
     * left most in right subtree */



    //............................O(h)==0(N)
    public static void main(String[] args) {
        //int values[]={5,1,3,4,2,7};
        Node root= null;
        int key= 1;
//        for(int i=0;i<values.length;i++){
//            root= insert(root,values[i]);
//        }
       root= insert(root,8);
       root= insert(root,15);
        inorder(root);
        System.out.println();
      //  System.out.println(search(root,key));
    }
}
