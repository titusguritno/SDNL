package UAS_SDNLB_205314110;

/**
 *
 * @author Titus Guritno
 */
public class TreeNode {
    public int data;
    public TreeNode leftNode;
    public TreeNode rightNode;
    
    public TreeNode() {
    }
    
    public TreeNode(int Data) {
        this.data = Data;
    }

    public int getData() {
        return data;
    }

    public void setData(int Data) {
        this.data = Data;
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
    
    public boolean isLeaf(){
        if(leftNode == null && rightNode == null){
            return true;
        }else{
            return false;
        }
    } 
}
