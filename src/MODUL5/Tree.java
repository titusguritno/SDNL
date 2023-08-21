package MODUL5;
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
    }

    public void add(int data) {
        TreeNode newNode = new TreeNode(data);
        TreeNode bantu = root;
        if (root == null) {
            root = new TreeNode(data);
            return;
        } else {
            while (true) {
                if (data < bantu.getData()) {
                    if (bantu.getLeftNode() == null) {
                        bantu.setLeftNode(newNode);
                        return;
                    } else {
                        bantu = bantu.getLeftNode();
                    }
                } else {
                    if (bantu.getRightNode() == null) {
                        bantu.setRightNode(newNode);
                        return;
                    } else {
                        bantu = bantu.getRightNode();
                    }
                }
            }
        }
    }

    public TreeNode getNode(int data) {
        TreeNode bantu = root;
        while (bantu != null) {
            if (data == bantu.getData()) {
                return bantu;
            } else if (data < bantu.getData()) {
                bantu = bantu.getLeftNode();
            } else {
                bantu = bantu.getRightNode();
            }
        }
        return null;
    }

    public TreeNode getPerent(int data) {
        TreeNode bantu = root;
        TreeNode perent = null;
        while (bantu != null) {
            if (data == bantu.getData()) {
                return perent;
            } else if (data < bantu.getData()) {
                perent = bantu;
                bantu = bantu.getLeftNode();
            } else {
                perent = bantu;
                bantu = bantu.getRightNode();
            }
        }
        return perent;
    }

    public int getDepth(int data) {
        TreeNode bantu = root;
        int depth = 0;
        while (bantu != null) {
            if (data == bantu.getData()) {
                return depth;
            } else if (data < bantu.getData()) {
                bantu = bantu.getLeftNode();
                depth++;
            } else {
                bantu = bantu.getRightNode();
                depth++;
            }
        }
        return -1;
    }

    public TreeNode getPredecessor(TreeNode data) {
        TreeNode bantu = data;
        bantu = bantu.leftNode;
        while (bantu.rightNode != null) {
            bantu = bantu.rightNode;
        }
        return bantu;
    }

    public boolean remove(int key) {
        TreeNode bantu = getNode(key);
        TreeNode perent = getPerent(key);
        TreeNode predecessor;
        TreeNode perentPredecessor;
        if (bantu == null) {
            return false;
        } else {
            if (bantu.getData() == root.getData()) {
                if (bantu.isLeaf()) {
                    root = null;
                } else if (bantu.getRightNode() == null) {
                    root = bantu.getLeftNode();
                } else if (bantu.getLeftNode() == null) {
                    root = bantu.getRightNode();
                } else {
                    predecessor = getPredecessor(bantu);
                    perentPredecessor = getPerent(predecessor.data);
                    bantu.data = predecessor.getData();
                    if (perentPredecessor != bantu) {
                        if (predecessor.getLeftNode() != null) {
                            perentPredecessor.rightNode = predecessor.leftNode;
                        } else {
                            perentPredecessor.rightNode = null;
                        }
                    } else {
                        bantu.leftNode = predecessor.leftNode;
                    }
                    return true;
                }
            } else {
                perent = getPerent(key);
                if (key < perent.getData()) {
                    if (bantu.isLeaf()) {
                        perent.leftNode = null;
                    } else if (bantu.getRightNode() == null) {
                        perent.leftNode = bantu.getLeftNode();
                    } else if (bantu.getLeftNode() == null) {
                        perent.leftNode = bantu.getRightNode();
                    } else {
                        predecessor = getPredecessor(bantu);
                        perentPredecessor = getPerent(predecessor.data);
                        bantu.data = predecessor.getData();
                        if (perentPredecessor != bantu) {
                            if (predecessor.getLeftNode() != null) {
                                perentPredecessor.rightNode = predecessor.leftNode;
                            } else {
                                perentPredecessor.rightNode = null;
                            }
                        } else {
                            bantu.leftNode = predecessor.leftNode;
                        }
                    }
                } else {
                    if (bantu.isLeaf()) {
                        perent.rightNode = null;
                    } else if (bantu.rightNode == null) {
                        perent.rightNode = bantu.leftNode;
                    } else if (bantu.leftNode == null) {
                        perent.rightNode = bantu.leftNode;
                    } else {
                        predecessor = getPredecessor(bantu);
                        perentPredecessor = getPerent(predecessor.data);
                        bantu.data = predecessor.getData();
                        if (perentPredecessor != bantu) {
                            if (predecessor.leftNode != null) {
                                perentPredecessor.rightNode = predecessor.leftNode;

                            } else {
                                perentPredecessor.rightNode = null;
                            }
                        } else {
                            bantu.leftNode = predecessor.leftNode;
                        }
                    }
                }
                return true;
            }
            return true;
        }
    }

    public TreeNode getRoot() {
        return root;
    }

    public void setRoot(TreeNode root) {
        this.root = root;
    }

    private void preOrder(TreeNode localRoot) {
        if (localRoot != null) {
            System.out.print(localRoot.getData() + " ");
            preOrder(localRoot.getLeftNode());
            preOrder(localRoot.getRightNode());
        }
    }

    private void inOrder(TreeNode localRoot) {
        if (localRoot != null) {
            inOrder(localRoot.getLeftNode());
            System.out.print(localRoot.getData() + " ");
            inOrder(localRoot.getRightNode());
        }
    }

    private void postOrder(TreeNode localRoot) {
        if (localRoot != null) {
            postOrder(localRoot.getLeftNode());
            postOrder(localRoot.getRightNode());
            System.out.print(localRoot.getData() + " ");
        }
    }

    public void preOrderTraversal() {
        preOrder(getRoot());
        System.out.println("");
    }

    public void inOrderTraversal() {
        inOrder(getRoot());
        System.out.println("");
    }

    public void postOrderTraversal() {
        postOrder(getRoot());
        System.out.println("");
    }
}
