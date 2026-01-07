/**
 * Definition for a binary tree node.
 * struct TreeNode {
 *     int val;
 *     TreeNode *left;
 *     TreeNode *right;
 *     TreeNode() : val(0), left(nullptr), right(nullptr) {}
 *     TreeNode(int x) : val(x), left(nullptr), right(nullptr) {}
 *     TreeNode(int x, TreeNode *left, TreeNode *right) : val(x), left(left), right(right) {}
 * };
 */
class Solution {
public:
    bool isSameTree(TreeNode* p, TreeNode* q) {
        if(p == NULL && q == NULL){
            return true;
        }
         if (p == NULL || q == NULL)
            return false;

        // If values don't match → NOT same
        if (p->val != q->val)
            return false;
            
        bool isSameLTree = isSameTree(p->left,q->left);
        bool isSameRTree = isSameTree(p->right,q->right);
       return  isSameLTree &&  isSameRTree && (p->val == q->val);
    }
   
};