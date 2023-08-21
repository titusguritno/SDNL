package MODUL5;
/**
 *
 * @author Titus Guritno
 */
public class MainDelete {
    public static void main(String[] args) {
        Tree tree = new Tree();
        int[] arr = {42, 21, 38, 27, 71, 82, 55, 63, 6, 2, 40, 12};
        for (int j : arr) {
            tree.add(j);
        }
        System.out.println("Data Sebelum Di Hapus");
        System.out.println("-->PreOrder");
        tree.preOrderTraversal();
        System.out.println("-->InOrder");
        tree.inOrderTraversal();
        System.out.println("-->PostOrder");
        tree.postOrderTraversal();
        System.out.println();
      
        System.out.println("Data Sesudah Node 21 Di Hapus");
        tree.remove(21); //Menghapus node 21
        System.out.println("--> Preorder");
        tree.preOrderTraversal();
        System.out.println("--> Inorder");
        tree.inOrderTraversal();
        System.out.println("--> Postorder");
        tree.postOrderTraversal();
        System.out.println("");
        
//        System.out.println("Data Sesudah Node 71 Di Hapus");
//        tree.remove(71); //Menghapus node 71
//        System.out.println("--> Preorder");
//        tree.preOrderTraversal();
//        System.out.println("--> Inorder");
//        tree.inOrderTraversal();
//        System.out.println("--> Postorder");
//        tree.postOrderTraversal();
//        System.out.println("");
    }
}
