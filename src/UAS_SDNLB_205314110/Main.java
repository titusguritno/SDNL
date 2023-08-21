package UAS_SDNLB_205314110;
/**
 *
 * @author Titus Guritno
 */
public class Main {
    public static void main(String[] args) {
        Tree tree = new Tree();
        int[] arr = {65,33,22,60,92,87,95,110};
        for (int j : arr) {
            tree.insert(j);
        }
        System.out.println("=============================");
        System.out.println("Data Sebelum Di Hapus");
        System.out.println("=============================");
        System.out.println("<--PreOrder-->");
        tree.preOrderTraversal();
        System.out.println("");
        System.out.println("<--InOrder-->");
        tree.inOrderTraversal();
        System.out.println("");
        System.out.println("<--PostOrder-->");
        tree.postOrderTraversal();
        System.out.println();
        
        System.out.println("=============================");
        System.out.println("Data Sesudah Node 65 Di Hapus");
        System.out.println("=============================");
        tree.remove(65); //Menghapus node 65
        System.out.println("<--PreOrder-->");
        tree.preOrderTraversal();
        System.out.println("");
        System.out.println("<--InOrder-->");
        tree.inOrderTraversal();
        System.out.println("");
        System.out.println("<--PostOrder-->");
        tree.postOrderTraversal();
        System.out.println();
    }
}
