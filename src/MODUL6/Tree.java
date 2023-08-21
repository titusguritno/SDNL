package MODUL6;
/**
 *
 * @author Titus Guritno
 */
public class Tree {
    private TreeNode root;
    
    public Tree(){
        root = null;
    }
    
    public void setRootTree(TreeNode treeNode){
        root = treeNode;
    }
    
    public void insertNode(char insertValue){
        if(root == null){
            root = new TreeNode(insertValue);
        }else{
            root.insert(insertValue);
        }
    }
    
    public void preorderTraversal(){
        preorderHelper(root);
    }
     
    private void preorderHelper(TreeNode node){
        if(node == null){
            return;
        }
        System.out.print(node.data + " ");
        preorderHelper(node.leftNode);
        preorderHelper(node.rightNode);
    }
    
    public void inorderTraversal(){
        inorderHelper(root);
    }
    
    private void inorderHelper(TreeNode node){
        if(node == null){
            return;
        }
        inorderHelper(node.leftNode);
        System.out.print(node.data + " ");
        inorderHelper(node.rightNode);
    }
    
    public void postorderTraversal(){
        postorderHelper(root);
    }
    
    private void postorderHelper(TreeNode node){
        if(node == null){
            return;
        }
        postorderHelper(node.leftNode);
        postorderHelper(node.rightNode);
        System.out.print(node.data + " ");
    }    
}
