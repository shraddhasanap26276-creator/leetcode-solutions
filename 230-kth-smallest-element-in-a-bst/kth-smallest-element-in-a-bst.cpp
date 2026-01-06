/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public:
    int preorder = 0;
     int kthSmallest(TreeNode* root, int k) {
        if(root == nullptr){
            return -1;
        }
    if(root->left != NULL){
        int leftAns = kthSmallest(root->left,k);
        if(leftAns != -1){
            return leftAns;
        }
    }
    if(preorder + 1 == k){
        return root->val;
    }
    preorder+= 1;

    if(root->right != NULL){
       int rightAns = kthSmallest(root->right,k);
        if(rightAns != -1){
            return rightAns;
        }
    }
    return -1;

    }
};