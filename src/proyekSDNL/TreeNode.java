/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyekSDNL;

/**
 *
 * @author Asus-GK
 */
public class TreeNode {
    private Kebaya kebaya;
    private TreeNode leftNode;
    private TreeNode rightNode;

    public TreeNode(Kebaya kebaya) {
        this.kebaya = kebaya;
    }


    public Kebaya getData() {
        return kebaya;
    }

    public void setData(Kebaya kebaya) {
        this.kebaya = kebaya;
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
