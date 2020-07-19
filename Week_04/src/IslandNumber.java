/**
 * @author Danny.
 * @version 1.0
 * @date 2020/7/19 11:12
 * @description 200. 岛屿数量
 */
public class IslandNumber {

  private int n;
  private int m;

  public int numIslands(char[][] grid) {
    //边界条件判断
    //二维数组的长度=行的长度
    n = grid.length;
    if (n == 0) {
      return 0;
    }
    int count = 0;
    m = grid[0].length;
    //二维数组的遍历的
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < m; j++) {
        if (grid[i][j] == '1') {
          //dfs-当前和上下左右的岛屿夷为平地-'1'->'0'
          dfsMarking(grid, i, j);
          count++;
        }
      }
    }
    return count;
  }

  private void dfsMarking(char[][] grid, int i, int j) {
    //recursion-终止条件
    if (i < 0 || j < 0 || i >= n || j >= m || grid[i][j] == '0') {
      return;
    }
    //-handle current logic岛屿夷为平地-'1'->'0'
    grid[i][j] = '0';
    //drill down
    //左
    dfsMarking(grid, i - 1, j);
    //右
    dfsMarking(grid, i + 1, j);
    //上
    dfsMarking(grid, i, j + 1);
    //下
    dfsMarking(grid, i, j - 1);
  }

}
