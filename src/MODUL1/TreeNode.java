package MODUL1;
/**
 *
 * @author Titus Guritno
 */
public class TreeNode {
    private int Data;
    private TreeNode leftNode, rightNode;

    TreeNode() {

    }

    TreeNode(int newData) {
        this.Data = newData;
    }

    public int getData() {
        return Data;
    }

    public void setData(int newData) {
        this.Data = newData;
    }

    public TreeNode getLeftNode() {
        return leftNode;
    }

    public void setLeftNode(TreeNode leftNode) {
        this.leftNode = leftNode;
    }

    public TreeNode getRightNode() {
        return rightNode;
    }

    public void setRightNode(TreeNode rightNode) {
        this.rightNode = rightNode;
    }
}
