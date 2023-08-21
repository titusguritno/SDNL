package MODUL4;
/**
 *
 * @author Titus Guritno
 */
public class MainDelete {
     public static void main(String[] args) {
        Tree del = new Tree();
        int[] arr = {42, 21, 38, 27, 71, 82, 55, 63, 6, 2, 40, 12};
        for (int j : arr) {
            del.insertNode(j);
        }

        System.out.println("Root: " + del.root.getData());
        System.out.println(" Data sebelum dihapus");
        System.out.println("--> Preorder");
        del.preOrderTraversal();
        System.out.println("");
        System.out.println("--> Inorder");
        del.inOrderTraversal();
        System.out.println("");
        System.out.println("--> Postorder");
        del.postOrderTraversal();

        del.delete(12);
        del.delete(27);
        del.delete(6);
        del.delete(55);

        System.out.println("\n");
        System.out.println("Data sesudah dihapus");
        System.out.println("--> Preorder");
        del.preOrderTraversal();
        System.out.println("");
        System.out.println("--> Inorder");
        del.inOrderTraversal();
        System.out.println("");
        System.out.println("--> Postorder");
        del.postOrderTraversal();
         System.out.println("");
    }
}
