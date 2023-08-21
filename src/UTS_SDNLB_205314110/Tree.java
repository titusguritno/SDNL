package UTS_SDNLB_205314110;

/**
 *
 * @author Titus Guritno
 */
public class Tree {

    private TreeNode root;

    public Tree() {

    }

    public Tree(TreeNode root) {
        this.root = root;
        this.root.setLeftNode(null);
        this.root.setRightNode(null);
    }

    public void insertNode(int key) {
        if (getRoot() == null) {
            setRoot(new TreeNode(key));
        } else {
            getRoot().insert(key);
        }
    }

    public TreeNode search(int value) {
        TreeNode temp = root;
        boolean ditemukan = false;

        while (root != null) {
            if (temp.getData() == value) {
                ditemukan = true;
                break;
            } else if (value <= temp.getData() && temp.getLeftNode() != null) {
                temp = temp.getLeftNode();
            } else if (value > temp.getData() && temp.getRightNode() != null) {
                temp = temp.getRightNode();
            } else {
                System.out.println("==============================");
                System.out.println("\tData Tidak Ditemukan!");
                break;
            }
        }
        if (ditemukan) {
            System.out.println("==============================");
            System.out.println("\tData Ditemukan!");
            return temp;
        } else {
            return null;
        }
    }

    public TreeNode getRoot() {
        return root;
    }

    public void setRoot(TreeNode root) {
        this.root = root;
    }

    public void preorderTranversal() {
        preorderHelper(getRoot());
        System.out.println("");
    }

    public void inorderTranversal() {
        inorderHelper(getRoot());
        System.out.println("");
    }

    public void postorderTranversal() {
        postorderHelper(getRoot());
        System.out.println("");
    }

    public void preorderHelper(TreeNode localRoot) {
        if (localRoot != null) {
            System.out.print(localRoot.getData() + " ");
            preorderHelper(localRoot.getLeftNode());
            preorderHelper(localRoot.getRightNode());
        }
    }

    public void inorderHelper(TreeNode localRoot) {
        if (localRoot != null) {
            inorderHelper(localRoot.getLeftNode());
            System.out.print(localRoot.getData() + " ");
            inorderHelper(localRoot.getRightNode());
        }
    }

    public void postorderHelper(TreeNode localRoot) {
        if (localRoot != null) {
            postorderHelper(localRoot.getLeftNode());
            postorderHelper(localRoot.getRightNode());
            System.out.print(localRoot.getData() + " ");
        }
    }

    public int dephHelper(TreeNode localRoot) {
        TreeNode temp = this.root;
        int result = 0;
        while (temp != null) {
            if (localRoot.getData() == temp.getData()) {
                break;
            } else if (localRoot.getData() < temp.getData()) {
                temp = temp.getLeftNode();
            } else {
                temp = temp.getRightNode();
            }
            result++;
        }
        return result;
    }

    public void deph(int node) {
        TreeNode temp = search(node);
        System.out.println("Deph : " + dephHelper(temp));
    }

    public int heightHelper(TreeNode temp) {
        if (root == null) {
            System.out.println("Tree is empty");
            return 0;
        } else {
            int leftHeight = 0, rightHeight = 0;

            if (temp.getLeftNode() != null) {
                leftHeight = heightHelper(temp.getLeftNode());
            }
            if (temp.getRightNode() != null) {
                rightHeight = heightHelper(temp.getRightNode());
            }
            return leftHeight >= rightHeight ? leftHeight + 1 : rightHeight + 1;
        }
    }

    public void height(int node) {
        TreeNode temp = search(node);
        System.out.println("Height : " + heightHelper(temp));
    }

    public int leafHelper(TreeNode localRoot) {
        if (localRoot == null) {
            return 0;
        } else if (localRoot.getLeftNode() == null && localRoot.getRightNode() == null) {
            System.out.println(localRoot.getData());
            return 1;
        }
        return leafHelper(localRoot.getLeftNode()) + leafHelper(localRoot.getRightNode());
    }

    public void leaf() {
        System.out.print("Jumlah leafnya adalah ");
        System.out.print(" dan sebanyak " + leafHelper(root) + " buah node");
        System.out.println();

    }

    public boolean isLeaf(int node) {
        TreeNode temp = search(node);
        return temp.getLeftNode() == null ? temp.getRightNode() == null : false;
    }

    public void descendant(int node) {
        TreeNode temp = search(node);
        System.out.print("Descendant : ");
        preorderHelper(temp.getLeftNode());
        preorderHelper(temp.getRightNode());
    }

    public boolean delete(int node) {
        return delete(root, node) != null ? true : false;
    }

    public TreeNode delete(TreeNode localRoot, int key) {
        if (localRoot == null) {
            return localRoot;
        } else if (localRoot.getData() > key) {
            localRoot.setLeftNode(delete(localRoot.getLeftNode(), key));
        } else if (localRoot.getData() < key) {
            localRoot.setRightNode(delete(localRoot.getRightNode(), key));
        } else {
            if (localRoot.getLeftNode() == null) {
                return localRoot.getRightNode();
            } else if (localRoot.getRightNode() == null) {
                return localRoot.getLeftNode();
            }
            localRoot.setData(getPredecessor(localRoot.getLeftNode()));
            localRoot.setLeftNode(delete(localRoot.getLeftNode(), localRoot.getData()));
        }
        return localRoot;
    }

    public int getPredecessor(TreeNode node) {
        int max = node.getData();
        while (node.getRightNode() != null) {
            max = node.getRightNode().getData();
            node = node.getRightNode();
        }
        return max;
    }
}
