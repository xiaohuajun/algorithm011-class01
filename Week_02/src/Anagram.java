import java.util.Arrays;

/**
 * @author Danny.
 * @version 1.0
 * @date 2020/7/4 09:02
 * @description 字母异位词
 */
public class Anagram {


  public boolean isAnagram(String s, String t) {
    if(s.length() != t.length()){
      return false;
    }
    char[] cs = s.toCharArray();
    char[] ct = t.toCharArray();
    Arrays.sort(cs);
    Arrays.sort(ct);
    return Arrays.equals(cs,ct);
  }


}
