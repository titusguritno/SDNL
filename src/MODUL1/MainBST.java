package MODUL1;
/**
 *
 * @author Titus Guritno
 */
public class MainBST {
    public static void main(String[] args) {
//        Tree tree = new Tree();
//        tree.insert(42);
//        tree.insert(21);
//        tree.insert(38);
//        tree.insert(27);
//        tree.insert(71);
//        tree.insert(82);
//        tree.insert(55);
//        tree.insert(63);
//        tree.insert(6);
//        tree.insert(2);
//        tree.insert(40);
//        tree.insert(12);
        Tree tree = new Tree();
        int[] arr = {42, 21, 38, 27, 71, 82, 55, 63, 6, 2, 40, 12};
        for (int j : arr) {
            tree.insert(j);
        }
        System.out.println("Root : " + tree.getRoot().getData());
        int nilai = 21;
        int nilai1 = 5;
        TreeNode key = tree.search(nilai);
        TreeNode key1 = tree.search(nilai1);

        System.out.println("Data Yang Dicari " + nilai);
        if (key != null) {
            System.out.println("Data Ditemukan ");
        } else {
            System.out.println("Data Tidak Ditemukan ");
        }

        System.out.println("");
        System.out.println("Data Yang DiCari " + nilai1);
        if (key1 != null) {
            System.out.println("Data Ditemukan ");
        } else {
            System.out.println("Data Tidak Ditemukan ");
        }
    }
}
