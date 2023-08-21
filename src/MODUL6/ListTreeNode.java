package MODUL6;
/**
 *
 * @author Titus Guritno
 */
public class ListTreeNode {
    TreeNode data;
    ListTreeNode nextNode;

    ListTreeNode(TreeNode insertItem) {
        this(insertItem, null);
    }

    ListTreeNode(TreeNode treeNode, ListTreeNode node) {
        data = treeNode;
        nextNode = node;
    }

    TreeNode getTreeNode() {
        return data;
    }

    ListTreeNode getNext() {
        return nextNode;
    }
}
