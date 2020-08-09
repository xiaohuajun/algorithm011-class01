import java.util.ArrayList;
import java.util.List;

/**
 * @author Danny.
 * @version 1.0
 * @date 2020/8/8 23:59
 * @description
 */
public class Parenthesis {



  private List<String> res;

  public List<String> generateParenthesis(int n) {
    res = new ArrayList<>();
    generate(0,0,n,"");
    return res;
  }

  private void generate(int left, int right,int n,String s){
    //terminator
    // left right已经用完
    if(left == n && right == n){
      res.add(s);
      return;
    }
    //handle current logic
    //drill down
    // validate
    if(left < n){
      generate(left + 1,right,n,s + "(");
    }
    //先有左括号再有右括号,
    if(right < left){
      generate(left,right + 1,n,s + ")");
    }
    //reverse state
  }
}
