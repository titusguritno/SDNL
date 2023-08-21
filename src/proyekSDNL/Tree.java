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
public class Tree {
    private TreeNode root;

    public Tree() {
    }

    public Tree(TreeNode root) {
        this.root = root;
    }

    public void insert(Kebaya value) {
        if (root == null) {
            root = new TreeNode(value);
        } else {
            TreeNode temp = root;
            TreeNode nodeTemp = new TreeNode(value);
            while (root != null) {
                if (nodeTemp.getData().getAsal().compareTo(temp.getData().getAsal()) <= 0 && temp.getLeftNode() == null) {
                    temp.setLeftNode(nodeTemp);
                    break;
                } else if (nodeTemp.getData().getAsal().compareTo(temp.getData().getAsal()) > 0 && temp.getRightNode() == null) {
                    temp.setRightNode(nodeTemp);
                    break;
                } else if (nodeTemp.getData().getAsal().compareTo(temp.getData().getAsal()) <= 0) {
                    temp = temp.getLeftNode();
                } else {
                    temp = temp.getRightNode();
                }
            }
        }
    }

    public TreeNode search(Kebaya value) {
        TreeNode temp = root;
        boolean ditemukan = false;

        if (root == null) {
            return null;
        } else {
            while (root != null) {
                if (temp.getData() == value) {
                    ditemukan = true;
                    break;
                } else if (value.getAsal().compareTo(temp.getData().getAsal()) < 0 && temp.getLeftNode() != null) {
                    temp = temp.getLeftNode();
                } else if (value.getAsal().compareTo(temp.getData().getAsal()) > 0 && temp.getRightNode() != null) {
                    temp = temp.getRightNode();
                } else {
                    break;
                }
            }
        }
        if (ditemukan) {
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

    public void delete(Kebaya key) {
        root = deleteHelper(root, key);
    }

    public TreeNode deleteHelper(TreeNode root, Kebaya key) {
        if (root == null) {
            return root;
        }

        if (key.getAsal().compareTo(root.getData().getAsal()) < 0) {
            root.setLeftNode(deleteHelper(root.getLeftNode(), key));
        } else if (key.getAsal().compareTo(root.getData().getAsal()) > 0) {
            root.setRightNode(deleteHelper(root.getRightNode(), key));
        } else {
            if (root.getLeftNode() == null) {
                return root.getRightNode();
            } else if (root.getRightNode() == null) {
                return root.getLeftNode();
            }

            root.setData(getPredeccessor(root.getLeftNode()));

            root.setLeftNode(deleteHelper(root.getLeftNode(), root.getData()));
        }

        return root;
    }

    public Kebaya getPredeccessor(TreeNode root) {
        Kebaya predeccessor = root.getData();
        while (root.getRightNode() != null) {
            predeccessor = root.getRightNode().getData();
            root = root.getRightNode();
        }
        return predeccessor;
    }
    
    public TreeNode getParent(Kebaya key){
        TreeNode node = search(key);
        return getParentHelper(node, root);
    }
    
    public TreeNode getParentHelper(TreeNode node, TreeNode localroot){
//        if (localroot != null) {
//            if (localroot.getLeftNode() != null && localroot.getRightNode() != null) {
//                return localroot;
//            }
//            inorderHelper(localroot.getLeftNode());
//            System.out.print(localroot.getData() + " ");
//            inorderHelper(localroot.getRightNode());
//        }

        TreeNode temp1 = root;
        TreeNode temp2 = node;
        while(true){
            if (root == node) {
                return null;
            } else if(temp1.getLeftNode() == node || temp1.getRightNode() == node) {
                return temp1;
            } else if (node.getData().getAsal().compareTo(temp1.getData().getAsal()) < 0){
                temp1 = temp1.getLeftNode();
            } else {
                temp1 = temp1.getRightNode();
            }
        }
    }
}
