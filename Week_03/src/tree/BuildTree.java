package tree;

/**
 * @author Danny.
 * @version 1.0
 * @date 2020/7/12 23:38
 * @description
 */
public class BuildTree {


  public TreeNode buildTree(int[] preOrder, int[] inOrder) {
    return buildTreeHelper(preOrder, 0, inOrder.length, inOrder, 0, inOrder.length);
  }

  private TreeNode buildTreeHelper(int[] preOrder, int pStart, int pEnd, int[] inOrder, int iStart, int iEnd) {
    // preOrder 为空，直接返回 null
    //terminator
    if (pStart == pEnd) {
      return null;
    }
    //handle current logic
    int rootVal = preOrder[pStart];
    TreeNode root = new TreeNode(rootVal);
    //在中序遍历中找到根节点的位置
    int iRootIndex = 0;
    for (int i = iStart; i < iEnd; i++) {
      if (rootVal == inOrder[i]) {
        iRootIndex = i;
        break;
      }
    }
    //drill down
    int leftNum = iRootIndex - iStart;
    //递归的构造左子树
    root.left = buildTreeHelper(preOrder, pStart + 1, pStart + leftNum + 1, inOrder, iStart, iRootIndex);
    //递归的构造右子树
    root.right = buildTreeHelper(preOrder, pStart + leftNum + 1, pEnd, inOrder, iRootIndex + 1, iEnd);
    return root;
  }

  public static void main(String[] args) {
    int[] preOrder = {3,9,20,15,7};
    int[] inOrder = {9,3,15,20,7};
    BuildTree buildTree = new BuildTree();
    System.out.println(buildTree.buildTree(preOrder,inOrder));
  }
}
