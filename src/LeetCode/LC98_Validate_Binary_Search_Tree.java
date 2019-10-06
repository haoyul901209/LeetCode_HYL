package LeetCode;

//98. Validate Binary Search Tree

import java.util.List;

public class LC98_Validate_Binary_Search_Tree {
    public boolean isValidBST(TreeNode root) {
       /* if(root == null) return true;
        return isValidBST(root, Long.MIN_VALUE, Long.MAX_VALUE);
    }
    private boolean isValidBST(TreeNode root, long lowerBound, long upperBound) {
        //base case
        if(root == null) return true;

        if(root.val >= upperBound || root.val <= lowerBound) {
            return false;
        }
        return isValidBST(root.left, lowerBound, root.val) && isValidBST(root.right, root.val, upperBound);
        */
       LC94_Binary_Tree_Inorder_Traversal sol = new LC94_Binary_Tree_Inorder_Traversal();
       List<Integer> list = sol.inorderTraversal(root);
       for(Integer i : list) {
           if(list.get(i + 1) <= list.get(i)) return false;
       }
       return true;

    }
}
