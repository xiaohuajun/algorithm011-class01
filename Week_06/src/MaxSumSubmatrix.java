/**
 * @author Danny.
 * @version 1.0
 * @date 2020/8/2 23:46
 * @description
 */
public class MaxSumSubmatrix {



  public int maxSumSubmatrix(int[][] matrix, int k) {
    int rows = matrix.length, cols = matrix[0].length, max = Integer.MIN_VALUE;
    // 枚举左边界
    for (int l = 0; l < cols; l++) {
      // 左边界改变才算区域的重新开始
      int[] rowSum = new int[rows];
      // 枚举右边界
      for (int r = l; r < cols; r++) {
        // 按每一行累计到 dp
        for (int i = 0; i < rows; i++) {
          rowSum[i] += matrix[i][r];
        }
        max = Math.max(max, dpMax(rowSum, k));
        // 尽量提前
        if (max == k) return k;
      }
    }
    return max;
  }

  /**
   *  在数组 arr 中，求不超过 k 的最大值
   * @param arr
   * @param k
   * @return
   */
  private int dpMax(int[] arr, int k) {
    int rollSum = arr[0], rollMax = rollSum;
    // O(rows)
    for (int i = 1; i < arr.length; i++) {
      if (rollSum > 0) rollSum += arr[i];
      else rollSum = arr[i];
      if (rollSum > rollMax) rollMax = rollSum;
    }
    if (rollMax <= k) return rollMax;
    int max = Integer.MIN_VALUE;
    for (int l = 0; l < arr.length; l++) {
      int sum = 0;
      for (int r = l; r < arr.length; r++) {
        sum += arr[r];
        if (sum > max && sum <= k) max = sum;
        // 尽量提前
        if (max == k) return k;
      }
    }
    return max;
  }


}
