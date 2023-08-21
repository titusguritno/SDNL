package MODUL2;
/**
 *
 * @author Titus Guritno
 */
public class MainTraversal {
    public static void main(String[] args) {
        Tree tree = new Tree();
        int[] arr = {42, 21, 38, 27, 71, 82, 55, 63, 6, 2, 40, 12};
        for (int j : arr) {
            tree.insert(j);
        }

        System.out.println("\n Pre-Order Traversal ");
        tree.preOrderHelper(tree.getRoot());
        System.out.println("");

        System.out.println("\n In-Order Traversal ");
        tree.inOrderHelper(tree.getRoot());
        System.out.println("");

        System.out.println("\n Post-Order Traversal ");
        tree.postOrderHelper(tree.getRoot());
        System.out.println("");
    }
}
