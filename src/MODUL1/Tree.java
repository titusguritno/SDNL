package MODUL1;
/**
 *
 * @author Tutus Guritno
 */
public class Tree {
    private TreeNode root;

    Tree() {
        this.root = null;
    }

    Tree(TreeNode node) {
        root = node;
        this.root.setLeftNode(null);
        this.root.setRightNode(null);
    }
    
    //Method Insert
    public void insert(int data) {
        TreeNode newNode = new TreeNode(data);
        TreeNode Node = root;

        if (root == null) {
            root = newNode;
        } else {
            while (Node != null) {
                if (newNode.getData() > Node.getData()) {
                    if (Node.getRightNode() == null) {
                        Node.setRightNode(newNode);
                        break;
                    } else {
                        Node = Node.getRightNode();
                    }
                } else if (newNode.getData() < Node.getData()
                        || newNode.getData() == Node.getData()) {
                    if (Node.getLeftNode() == null) {
                        Node.setLeftNode(newNode);
                        break;
                    } else {
                        Node = Node.getLeftNode();
                    }

                }
            }
        }
    }

    //Method Search
    public TreeNode search(int search) {
        TreeNode searchNode = root;
        while (searchNode != null) {
            if (search == searchNode.getData()) {
                return searchNode;
            } else if (searchNode.getData() <= search) {
                searchNode = searchNode.getRightNode();
            } else {
                searchNode = searchNode.getLeftNode();
            }
        }
        return null;
    }

    public TreeNode getRoot() {
        return root;
    }

    public void setRoot(TreeNode root) {
        this.root = root;
    }
}
