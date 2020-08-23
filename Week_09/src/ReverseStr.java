/**
 * @author Danny.
 * @version 1.0
 * @date 2020/8/22 23:44
 * @description
 */
public class ReverseStr {


  /**
   * 反转字符串 II
   * @param s
   * @param k
   * @return
   */
  public String reverseStr(String s, int k) {
    char[] ch = s.toCharArray();
    int last = ch.length % (2*k);
    for(int i = 0;i < ch.length - last;i = i + 2*k){
      swap(ch,i,i+k-1);
    }
    if(last < k){
      swap(ch,ch.length-last,ch.length-1);
    }else{
      swap(ch,ch.length-last,ch.length-last+k-1);
    }
    return String.valueOf(ch);
  }

  public void swap(char[] ch,int left,int right){
    while(left < right){
      char c = ch[left];
      ch[left] = ch[right];
      ch[right] = c;
      left++;
      right--;
    }
  }

}
