package MODUL3;

/**
 *
 * @author Titus Guritno
 */
public class Tree {

    private TreeNode root;

    public Tree() {

    }

    public Tree(TreeNode node) {

    }

    public void insert(int value) {
        TreeNode temp = new TreeNode(value);
        if (root == null) {
            root = temp;
        } else {
            TreeNode pointer;
            pointer = root;
            while (true) {
                if (temp.getData() <= pointer.getData()) {
                    if (pointer.getLeftNode() == null) {
                        pointer.setLeftNode(temp);
                        return;
                    } else {
                        pointer = pointer.getLeftNode();
                    }
                } else {
                    if (pointer.getRightNode() == null) {
                        pointer.setRightNode(temp);
                        return;
                    } else {
                        pointer = pointer.getRightNode();
                    }
                }
            }
        }
    }

    void insertRek(int value) {
        root = insertRec(root, value);
    }

    private TreeNode insertRec(TreeNode root, int value) {

        if (root == null) {
            root = new TreeNode(value);
            return root;
        }

        if (value < root.getData()) {
            root.setLeftNode(insertRec(root.getLeftNode(), value));
        } else if (value > root.getData()) {
            root.setRightNode(insertRec(root.getRightNode(), value));
        }

        return root;
    }

    public TreeNode search(int value) {
        TreeNode pointer = root;
        while (pointer != null) {
            System.out.println(pointer.getData());
            if (pointer.getData() == value) {
                System.out.println("Data " + value + " Ditemukan");
                return pointer;
            } else {
                if (pointer.getData() <= value) {
                    pointer = pointer.getRightNode();
                } else {
                    pointer = pointer.getLeftNode();
                }
            }
        }
        System.out.println("Data " + value + " tidak ditemukan");
        return pointer;
    }

    public TreeNode getRoot() {
        return null;
    }

    public void setRoot(TreeNode node) {
        this.root = node;
    }

    public void PreOrderTraversal() {
        PreOrderHelper(root);
    }

    public void InOrderTraversal() {
        InOrderHelper(root);
    }

    public void PostOrderTraversal() {
        PostOrderHelper(root);
    }

    private void PreOrderHelper(TreeNode localRoot) {
        if (localRoot != null) {
            System.out.print(localRoot.getData() + " ");
            PreOrderHelper(localRoot.getLeftNode());
            PreOrderHelper(localRoot.getRightNode());
        }
    }

    private void InOrderHelper(TreeNode localRoot) {
        if (localRoot != null) {
            InOrderHelper(localRoot.getLeftNode());
            System.out.print(localRoot.getData() + " ");
            InOrderHelper(localRoot.getRightNode());
        }
    }

    private void PostOrderHelper(TreeNode localRoot) {
        if (localRoot != null) {
            PostOrderHelper(localRoot.getLeftNode());
            PostOrderHelper(localRoot.getRightNode());
            System.out.print(localRoot.getData() + " ");
        }
    }

    public void depth(int x) {
        System.out.println(DepthHelper(x));
    }

    private int DepthHelper(int value) {
        TreeNode pointer = root;
        int i = 0;
        if (pointer == null) {
            return i;
        } else {
            while (pointer.getData() != value) {
                if (pointer.getData() <= value) {
                    pointer = pointer.getRightNode();
                    i++;
                } else {
                    pointer = pointer.getLeftNode();
                    i++;
                }
            }
        }
        return i;
    }

    public void height(int value) {
        System.out.println(maxDepth(root) - DepthHelper(value));
    }

    private int maxDepth(TreeNode node) {
        if (node == null) {
            return 0;
        } else {

            int lDepth = maxDepth(node.getLeftNode());
            int rDepth = maxDepth(node.getRightNode());

            if (lDepth > rDepth) {
                return (lDepth + 1);
            } else {
                return (rDepth + 1);
            }
        }
    }

    public void leaf() {
        postOrderSearchLeaf(root);
    }

    private void postOrderSearchLeaf(TreeNode localRoot) {
        if (localRoot != null) {
            postOrderSearchLeaf(localRoot.getLeftNode());
            postOrderSearchLeaf(localRoot.getRightNode());
            if (localRoot.getLeftNode() == null && localRoot.getRightNode() == null) {
                System.out.print(localRoot.getData() + ", ");
            }
        }
    }

    public void descendant(int value) {
        TreeNode pointer = root;
        while (pointer != null) {
            if (pointer.getData() == value) {
                PreOrderTraversal();
            } else {
                if (pointer.getData() <= value) {
                    pointer = pointer.getRightNode();
                } else {
                    pointer = pointer.getLeftNode();
                }

                if (pointer.getData() == value) {
                    PreOrderHelper(pointer.getLeftNode());
                    PreOrderHelper(pointer.getRightNode());
                    break;
                }
            }
        }
    }
}
