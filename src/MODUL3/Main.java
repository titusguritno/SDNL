package MODUL3;

/**
 *
 * @author Titus Guritno
 */
public class Main {
    public static void main(String[] args) {

        Tree tree1 = new Tree();

        tree1.insertRek(42);
        tree1.insertRek(21);
        tree1.insertRek(38);
        tree1.insertRek(27);
        tree1.insertRek(71);
        tree1.insertRek(82);
        tree1.insertRek(55);
        tree1.insertRek(63);
        tree1.insertRek(6);
        tree1.insertRek(2);
        tree1.insertRek(40);
        tree1.insertRek(12);
        
        System.out.println("Height dari 6 : ");
        tree1.height(6);
        System.out.println("Leaf pada BST : ");
        tree1.leaf();
        System.out.println("");
        System.out.println("Depth dari 38 : ");
        tree1.depth(38);
        System.out.println("Desecendant dari 21 : ");
        tree1.descendant(21);
        System.out.println("");
    }

}
