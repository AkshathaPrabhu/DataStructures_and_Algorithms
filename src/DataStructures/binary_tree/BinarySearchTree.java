package DataStructures.binary_tree;

public class BinarySearchTree {

    class Node {
        int key;
        Node left, right;

        public Node(int item) {
            key = item;
            left = right = null;
        }
    }

    Node root;

    BinarySearchTree() {
        root = null;
    }

    // Driver Program to test above functions
    public static void main(String[] args) {
        BinarySearchTree tree = new BinarySearchTree();

        /* Let us create following BST
              50
           /     \
          30      70
         /  \    /  \
       20   40  60   80 */
        tree.insert(50);
        tree.insert(30);
        tree.insert(20);
        tree.insert(40);
        tree.insert(70);
        tree.insert(60);
        tree.insert(80);


        //to print the tree in in-order way [left-root-right]
        tree.inorder();
    }


    private void insert(int key) {
        root = insertKey(root, key);
    }

    private Node insertKey(Node root, int key) {
        if (root == null) {
            root = new Node(key);
            return root;
        } else {
            if (key < root.key) {
                root.left = insertKey(root.left, key);
            } else if (key > root.key) {
                root.right = insertKey(root.right, key);
            }
        }
        return root;

    }

    private void inorder() {
        inorderTraversal(root);
    }


    private void inorderTraversal(Node root) {
        if (root != null) {
            inorderTraversal(root.left);
            System.out.println(root.key);
            inorderTraversal(root.right);
        }

    }
}




