package myBST;

import TreeNode.TreeNode;

public class MyBinarysearchTree {
    TreeNode root;

    public TreeNode getRoot() {
        return root;
    }

    public void insert(int data){
        TreeNode node = new TreeNode(data);
        if(root==null){
            root=node;
        }
        else{
            TreeNode temp=root;
            TreeNode parent=null;
            while(temp!=null) {

                parent = temp;
                if (node.getData() <= temp.getData()) {
                    temp = temp.getLeft();
                } else {
                    temp = temp.getRight();
                }
            }
                if(node.getData()<=parent.getData()){
                    parent.setLeft(node);
                }
                else{
                    parent.setRight(node);
                }

        }
    }


    public void traverseInorder(TreeNode node){
        if(node!=null){
            traverseInorder(node.getLeft());
            System.out.println(node.getData()+", ");
            traverseInorder(node.getRight());
        }
    }
    public void traversePreorder(TreeNode node){
        if(node!=null){
            System.out.println(node.getData()+", ");
            traversePreorder(node.getLeft());

            traversePreorder(node.getRight());
        }
    }
    public void traversePostorder(TreeNode node){
        if(node!=null){
            traversePostorder(node.getLeft());

            traversePostorder(node.getRight());
            System.out.println(node.getData()+", ");
        }
    }














}
