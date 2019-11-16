/* importing the inbuilt java classes required for the program */

import java.util.Queue;
import java.util.LinkedList;

/* Class to represent Tree node */
class Node_bfs {
    int data;
    Node_bfs left, right;

    public Node_bfs(int item) {
        data = item;
        left = null;
        right = null;
    }
}

/* Class to print Level Order Traversal */
class BinaryTree {

    Node_bfs root;


    public static void main(String args[]) {
        /* creating a binary tree and entering
         the nodes */
        BinaryTree tree_level = new BinaryTree();
        tree_level.root = new Node_bfs(1);
        tree_level.root.left = new Node_bfs(2);
        tree_level.root.right = new Node_bfs(3);
        tree_level.root.left.left = new Node_bfs(4);
        tree_level.root.left.right = new Node_bfs(5);

        System.out.println("Level order traversal of binary tree is - ");
        tree_level.printLevelOrder();
    }


    /* Given a binary tree. Print its nodes in level order using queue  */
    void printLevelOrder() {
        Queue<Node_bfs> queue = new LinkedList<Node_bfs>();
        queue.add(root);
        while (!queue.isEmpty()) {

            // poll() removes the present head, i.e. dequeue  a node
            Node_bfs tempNode = queue.poll();
            System.out.print(tempNode.data + " ");

            /*Enqueue left child */
            if (tempNode.left != null) {
                queue.add(tempNode.left);
            }

            /*Enqueue right child */
            if (tempNode.right != null) {
                queue.add(tempNode.right);
            }
        }
    }


}