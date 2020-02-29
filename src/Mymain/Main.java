package Mymain;

import TreeNode.TreeNode;
import myBST.MyBinarysearchTree;

public class Main {
    public static void main(String[] args) {
        MyBinarysearchTree tree = new MyBinarysearchTree();


        tree.insert(89);
        tree.insert(43);
        tree.insert(34);
        tree.insert(58);
        tree.insert(86);
        tree.insert(6);
        tree.insert(1);
        tree.insert(7);
        TreeNode root =  tree.getRoot();
        tree.traverseInorder(root);

    }
}
