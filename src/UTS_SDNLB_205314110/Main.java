package UTS_SDNLB_205314110;

/**
 *
 * @author Titus Guritno
 */
public class Main {
    public static void main(String[] args) {
        Tree tree = new Tree();
        int[] arr = {38,59,56,70,90,14,19,84};
        for (int j : arr) {
            tree.insertNode(j);            
        }
        
        System.out.println("-->Pre-Order Traversal<--");
        tree.preorderHelper(tree.getRoot());
        System.out.println("");

        System.out.println("\n-->In-Order Traversal<--");
        tree.inorderHelper(tree.getRoot());
        System.out.println("");

        System.out.println("\n-->Post-Order Traversal<--");
        tree.postorderHelper(tree.getRoot());
        System.out.println("");
        
        tree.leaf();
    }
}
