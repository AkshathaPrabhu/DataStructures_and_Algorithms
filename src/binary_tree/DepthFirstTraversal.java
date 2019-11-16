package binary_tree;// Java program for different tree traversals

class BinaryTreeTypes {
    // Root of Binary Tree
    Node_bt root;

    BinaryTreeTypes() {
        root = null;
    }


    // Driver method
    public static void main(String[] args) {
        BinaryTreeTypes tree = new BinaryTreeTypes();
        tree.root = new Node_bt(1);
        tree.root.left = new Node_bt(2);
        tree.root.right = new Node_bt(3);
        tree.root.left.left = new Node_bt(4);
        tree.root.left.right = new Node_bt(5);

        System.out.println("Preorder traversal of binary tree is ");
        tree.printPreorder();

        System.out.println("\nInorder traversal of binary tree is ");
        tree.printInorder();

        System.out.println("\nPostorder traversal of binary tree is ");
        tree.printPostorder();
    }

    
    /* Given a binary tree, print its Node_bts according to the "bottom-up" postorder traversal. */
    void printPostorder(Node_bt Node_bt) {
        if (Node_bt == null)
            return;

        // first recur on left subtree
        printPostorder(Node_bt.left);

        // then recur on right subtree
        printPostorder(Node_bt.right);

        // now deal with the binary_tree.Node_bt
        System.out.print(Node_bt.key + " ");
    }

    /* Given a binary tree, print its Node_bts in inorder*/
    void printInorder(Node_bt Node_bt) {
        if (Node_bt == null)
            return;

        /* first recur on left child */
        printInorder(Node_bt.left);

        /* then print the data of binary_tree.Node_bt */
        System.out.print(Node_bt.key + " ");

        /* now recur on right child */
        printInorder(Node_bt.right);
    }

    /* Given a binary tree, print its Node_bts in preorder*/
    void printPreorder(Node_bt Node_bt) {
        if (Node_bt == null)
            return;

        /* first print data of binary_tree.Node_bt */
        System.out.print(Node_bt.key + " ");

        /* then recur on left sutree */
        printPreorder(Node_bt.left);

        /* now recur on right subtree */
        printPreorder(Node_bt.right);
    }

    // Wrappers over above recursive functions
    void printPostorder() {
        printPostorder(root);
    }

    void printInorder() {
        printInorder(root);
    }

    void printPreorder() {
        printPreorder(root);
    }

}


/* Class containing left and right child of current binary_tree.Node_bt and key value*/
class Node_bt {
    int key;
    Node_bt left;
    Node_bt right;

    public Node_bt(int item) {
        key = item;
        left = right = null;
    }
}
