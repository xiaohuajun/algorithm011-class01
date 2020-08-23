import java.util.HashMap;
import java.util.Map;

/**
 * @author Danny.
 * @version 1.0
 * @date 2020/8/22 23:38
 * @description
 */
public class FirstUniqChar {

  /**
   * 字符串中的第一个唯一字符
   * @param s
   * @return
   */
  public int firstUniqChar(String s) {
    Map<Character, Integer> count = new HashMap<>();
    int n = s.length();
    for (int i = 0; i < n; i++) {
      char c = s.charAt(i);
      count.put(c, count.getOrDefault(c, 0) + 1);
    }

    for (int i = 0; i < n; i++) {
      if (count.get(s.charAt(i)) == 1){
        return i;
      }
    }
    return -1;
  }

}
