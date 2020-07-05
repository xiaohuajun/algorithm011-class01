import java.util.HashMap;

/**
 * @author Danny.
 * @version 1.0
 * @date 2020/7/4 10:03
 * @description
 */
public class TwoSum {
  public int[] twoSum(int[] nums, int target) {
    //创建返回数组
    int[] result = new int[2];
    //创建map
    HashMap<Integer,Integer> num = new HashMap<>(16);
    for(int i = 0,length = nums.length; i<length; i++){
      if(num.containsKey(target-nums[i]) ){
        result[0]=num.get(target-nums[i]);
        result[1]=i;
        break;
      }
      num.put(nums[i],i);
    }
    return result;
  }
}
