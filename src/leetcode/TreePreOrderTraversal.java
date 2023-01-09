/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author _ muhammadsobananjum
 */

   class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode() {}
      TreeNode(int val) { this.val = val; }
      TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
          this.right = right;
      }
  }
public class TreePreOrderTraversal {
    
   public List<Integer> preorderTraversal(TreeNode root) {
       // Create a list to store the traversal result
	List<Integer> result = new ArrayList<>();
	
       // Call helper method to perform the traversal
	traversal(root, result);
	
       // Return the result
	return result;
   }
   
   // Helper method to perform the preorder traversal
   public void traversal(TreeNode root, List<Integer> result) {
       // Return if the current node is null
	if(root == null) return;
	
       // Add the current node's value to the result list
	result.add(root.val);
	
       // Recursively traverse the left and right subtrees
	traversal(root.left, result);
	traversal(root.right, result);
   }
}
    

