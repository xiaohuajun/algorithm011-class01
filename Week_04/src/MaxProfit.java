/**
 * @author Danny.
 * @version 1.0
 * @date 2020/7/18 22:55
 * @description
 */
public class MaxProfit {

  /**
   *给定一个数组，它的第 i 个元素是一支给定股票第 i 天的价格。
   *设计一个算法来计算你所能获取的最大利润。你可以尽可能地完成更多的交易（多次买卖一支股票）。
   *注意：你不能同时参与多笔交易（你必须在再次购买前出售掉之前的股票）
   * 贪心法：只要认为当前价格>前一天的价格 就是当前利润
   * @param prices 股票的价格
   * @return
   */
    public int maxProfit(int[] prices){
      int maxProfit = 0;
      for(int i = 1;i < prices.length;i++){
          if(prices[i - 1] < prices[i]){
            maxProfit += prices[i] - prices[i-1];
          }
      }
      return maxProfit;
    }

}
