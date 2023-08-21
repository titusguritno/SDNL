package UTS_SDNLB_205314110;

/**
 *
 * @author Titus Guritno
 */
public class TreeNode {
    private int data;
    private TreeNode leftNode;
    private TreeNode rightNode;

    public TreeNode(int data) {
        this.data = data;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
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

    public void insert(int data) {
        if (data > getData()) {
            if (getRightNode() == null) {
                setRightNode(new TreeNode(data));
            } else {
                getRightNode().insert(data);
            }
        } else {
            if (getLeftNode() == null) {
                setLeftNode(new TreeNode(data));
            } else {
                getLeftNode().insert(data);
            }
        }
    }
}
