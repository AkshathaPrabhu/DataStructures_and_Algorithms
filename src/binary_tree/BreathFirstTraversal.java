package binary_tree;

import java.util.Queue;
import java.util.LinkedList;


/* Class to print Level Order Traversal */
public class BreathFirstTraversal {

    Node root;


    public static void main(String args[]) {
        /* creating a binary tree and entering
         the nodes */
        BreathFirstTraversal tree_level = new BreathFirstTraversal();
        tree_level.root = new Node(2);
        tree_level.root.left = new Node(6);
        tree_level.root.right = new Node(3);
        tree_level.root.left.left = new Node(4);
        tree_level.root.left.right = new Node(5);

        System.out.println("Level order traversal of binary tree is - ");
        tree_level.printLevelOrder();
    }


    /* Given a binary tree. Print its nodes in level order using queue  */
    void printLevelOrder() {
        Queue<Node> queue = new LinkedList<Node>();
        queue.add(root);
        while (!queue.isEmpty()) {

            // poll() removes the present head, i.e. dequeue  a node
            Node tempNode = queue.poll();
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