package BinaryTree;

public class BinaryTreeTest {

    public static void Test(){
        var tree = new BinaryTree();

        tree.insert(7);
        tree.insert(4);
        tree.insert(9);
        tree.insert(1);
        tree.insert(6);
        tree.insert(8);
        tree.insert(10);

        System.out.println(tree.find(10)); // T
        System.out.println(tree.find(11)); // F

        // Testing Traversal
        tree.traversePreOrder();

        // Height of the tree
        System.out.println("Tree height = " + tree.height());
        System.out.println("Tree min = " + tree.min());

        // Testing 2 trees are eqaul
        var tree1 = new BinaryTree();

        tree1.insert(7);
        tree1.insert(4);
        tree1.insert(9);
        tree1.insert(1);
        tree1.insert(6);
        tree1.insert(8);
        tree1.insert(10);

        System.out.println("Are trees equal? " + tree.equals(tree1));

        // Testing if a tree is a binary search tree
        System.out.println("Is binary search tree? " + tree.isBinarySearchTree());

        // Prints all nodes at K Distance from the root
        tree.printNodesAtDistance(2);

        // Level Order Traversal
        tree.traverseLevelOrder();

        System.out.println("done");
    }
}
