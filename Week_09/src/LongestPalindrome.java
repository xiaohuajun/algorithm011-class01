/**
 * @author Danny.
 * @version 1.0
 * @date 2020/8/22 13:45
 * @description
 */
public class LongestPalindrome {


  /**
   * 最长回文子串
   * @param s
   * @return
   */
  public String longestPalindrome(String s) {
    int len = s.length();
    if(len <= 0){
      return "";
    }
    int longestPal = 1;
    String longestStr = s.substring(0,1);
    for(int i = 0 ; i<len ; i++){
      //奇数的回文子串
      String longestOdd = centerSpread(s,len,i,i);
      //偶数的回文子串
      String longestEven = centerSpread(s,len,i,i+1);
      String maxLenStr = longestOdd.length() > longestEven.length()
          ? longestOdd : longestEven;
      if(maxLenStr.length() > longestPal){
        longestPal = maxLenStr.length();
        longestStr = maxLenStr;
      }
    }
    return longestStr;
  }

  //扩散方法
  private String centerSpread(String s , int len , int left , int right){
    int l = left;
    int r = right;
    while(l >= 0 && r<len && s.charAt(l)==s.charAt(r)){
      l--;
      r++;
    }
    return s.substring(l+1,r);
  }

}
