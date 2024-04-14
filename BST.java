import java.util.ArrayList;

public class BST {
    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
        }
    }

    //insert function
    public static Node insert(Node root, int val) {
        if(root == null) {
            root = new Node(val);
            return root;
        }

        if(root.data > val) {
            //left subtree
            root.left = insert(root.left, val);
        }  else {
            //right subtree
            root.right = insert(root.right, val);
        } 

        return root;
    }

    //inorder traversal
    public static void inOrderTraversal(Node root) { //0(H) height

        if(root == null) {
            return;
        }
        inOrderTraversal(root.left);
        System.out.print(root.data + " ");
        inOrderTraversal(root.right);
    }

    //Search BST 
    public static boolean search(Node root, int key) {

        if(root == null) { 
            return false;
        }

        if(root.data > key) { //left subtree
            return  search(root.left, key);
        }  else if(root.data == key){ 
            return true;
        } else {//right subtree
            return search(root.right, key);
        }
    }

    //delete a node
    public static Node delete(Node root,int val) {
        if(root.data > val) {
            root.left = delete(root.left, val);
        } else if(root.data  < val) { 
            root.right = delete(root.right, val);
        } else { //root.data == val
            //Case 1 it is a leaf node no child nodes
            if(root.left == null && root.right == null) {
                return null;
            }
            //Case 2
            if(root.left == null) {
                return root.right;
            } else if(root.right == null) {
                return root.left;
            }

            //Case 3
            Node IS = inOrderSuccessor(root.right);
            root.data = IS.data;
            root.right = delete(root.right, IS.data);
        }

        return root;
    }  

    //inorder successor 
    public static Node inOrderSuccessor(Node root) {
        while(root.left != null) { 
            root = root.left;
        }

        return root;
    }

    //Question: Print in range
    public static void printInRange(Node root, int x, int y) {

        if(root == null) {
            return;
        }
        if(root.data >= x && root.data <= y) {
            printInRange(root.left, x, y);
            System.out.print(root.data + " ");
            printInRange(root.right, x, y);
        } else if(root.data >= y) { 
            printInRange(root.left, x, y);
        } else {
            printInRange(root.right, x, y);
        }
    }

    //Question Root to leaf
    public static void printRoot2Leaf(Node root, ArrayList<Integer> path) {

        if(root == null) {
            return;
        }

        path.add(root.data);

        //leaf
        if(root.left == null && root.right == null) {
            printPath(path);
        } else { //non-leaf
            printRoot2Leaf(root.left, path);
            printRoot2Leaf(root.right, path);
        }
        path.remove(path.size() - 1);
    }

    //print path
    public static void printPath(ArrayList<Integer> path) {
        for(int i = 0; i < path.size(); i++) {
            System.out.print(path.get(i) + "->");
        }  
        System.out.println();
    }
    public static void main(String args[]) {
        int values[] = {8, 5, 3, 6, 10, 11, 14};
        Node root = null;

        for(int i = 0; i < values.length; i++) {
            root = insert(root, values[i]);
        }
        
        inOrderTraversal(root);
        System.out.println();

       // delete(root, 5);
        //inOrderTraversal(root);

        //System.out.println();
        //printInRange(root, 3, 12);

        System.out.println();
        printRoot2Leaf(root, new ArrayList<>());
    }
}
