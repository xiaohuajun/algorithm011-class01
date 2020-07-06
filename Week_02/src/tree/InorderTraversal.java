package tree;

import java.util.LinkedList;
import java.util.List;


/**
 * @author Danny.
 * @version 1.0
 * @date 2020/7/5 21:04
 * @description 二叉树中序遍历
 */
public class InorderTraversal {


  public List<Integer> inorderTraversal(TreeNode root) {
    List<Integer> res = new LinkedList<Integer>();
    if (root == null) {
      return res;
    }
    helper(root,res);
    return res;
  }

  private void helper(TreeNode root, List<Integer> res){
    //先遍历左子结点
    if(root.left != null){
      helper(root.left,res);
    }
    //根节点
    res.add(root.val);
    //右子节点
    if(root.right != null){
      helper(root.right,res);
    }
  }

}
