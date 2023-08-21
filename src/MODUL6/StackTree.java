package MODUL6;
/**
 *
 * @author Titus Guritno
 */
public class StackTree {
    public ListTree StackListTree;

    public StackTree() {
        StackListTree = new ListTree();
    }

    public void push(TreeNode node) {
        StackListTree.insertAtFront(node);
    }

    public TreeNode pop() {
        return StackListTree.removeFromFront();
    }

    public boolean isEmpty() {
        return StackListTree.isEmpty();
    }

    public void print() {
        StackListTree.print();
    }
}
