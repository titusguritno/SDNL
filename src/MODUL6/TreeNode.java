package MODUL6;
/**
 *
 * @author Titus Guritno
 */
public class TreeNode {
    public char data;
    public TreeNode leftNode;
    public TreeNode rightNode;

    public TreeNode() {
    }

    public TreeNode(char Data) {
        this.data = Data;
    }

    public char getData() {
        return data;
    }

    public void setData(char Data) {
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

    public boolean isLeaf() {
        if (leftNode == null && rightNode == null) {
            return true;
        } else {
            return false;
        }
    }
    
    public void insert(char insertValue){
        if(insertValue < data){
            if(leftNode == null){
                leftNode = new TreeNode(insertValue);
            }else{
                leftNode.insert(insertValue);
            }
        }else if(insertValue > data){
            if(rightNode == null){
                rightNode = new TreeNode(insertValue);
            }else{
                rightNode.insert(insertValue);
            }            
        }
    }
}
