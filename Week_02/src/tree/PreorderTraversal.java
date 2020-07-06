package tree;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Danny.
 * @version 1.0
 * @date 2020/7/5 00:07
 * @description 前序遍历
 */
public class PreorderTraversal {


  public List<Integer> preorderTraversal(TreeNode root) {
    List<Integer> res = new ArrayList<>();
    if (root == null) {
      return res;
    }
    helper(root,res);
    return res;
  }
  private void helper(TreeNode root, List<Integer> res) {
    if (root == null) {
      return;
    }
    res.add(root.val);
    helper(root.left, res);
    helper(root.right, res);
  }


}
