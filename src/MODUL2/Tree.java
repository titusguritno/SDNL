package MODUL2;
/**
 *
 * @author Titus Guritno
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

    public void setRoot(TreeNode root) {
        this.root = root;
    }

    public TreeNode getRoot() {
        return root;
    }

    public void preOrderTraversal() {
        preOrderHelper(root);
    }

    public void inOrderTraversal() {
        inOrderHelper(root);
    }

    public void postOrderTraversal() {
        postOrderHelper(root);
    }

    public void preOrderHelper(TreeNode node) {
        if (node != null) {
            System.out.print(node.getData() + "->");
            preOrderHelper(node.getLeftNode());
            preOrderHelper(node.getRightNode());
        }

    }

    public void inOrderHelper(TreeNode node) {
        if (node != null) {
            inOrderHelper(node.getLeftNode());
            System.out.print(node.getData() + "->");
            inOrderHelper(node.getRightNode());
        }
    }

    public void postOrderHelper(TreeNode node) {
        if (node != null) {
            postOrderHelper(node.getLeftNode());
            postOrderHelper(node.getRightNode());
            System.out.print(node.getData() + "->");
        }
    }
}
