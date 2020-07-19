/**
 * @author Danny.
 * @version 1.0
 * @date 2020/7/18 23:21
 * @description
 */
public class LemonadeChange {


  /**
   * 贪心法
   * @param bills
   * @return
   */
  public boolean lemonadeChange(int[] bills) {
    int five = 0;
    int ten = 0;
    for(int bill : bills){
      if(bill == 5){
        five++;
      }else if(bill == 10){
        if(five == 0){
          return false;
        }else{
          five--;
          ten++;
        }
      }else {
        if(five > 0 && ten > 0){
          five--;
          ten--;
        }else if(five >= 3) {
          five -= 3;
        }else{
          return false;
        }
      }
    }
    return true;
  }


}
