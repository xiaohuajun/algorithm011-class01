## 递归模板
terminator---递归终止的条件
    
handle current logic---处理当前逻辑
  
drill down---下钻到下一层
    
reverse states---清理当前的结果

例子：[括号生成](https://leetcode-cn.com/problems/generate-parentheses/)

```java
class Solution {
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
            // a  vaidate 
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
```
## 分治法例子

#### [50. Pow(x, n)](https://leetcode-cn.com/problems/powx-n/)

//2^10 = 2^5 * 2 ; 2^5 = 2^2 * 2 * 2^1(self)
// split big problem: 
// subResult = pow(x,n/2);
// merge result:
// judge  n is odd or even
```java
public double  myPow(double x,double n){
    long sn  = n;
    //handle  n  
    if(sn < 0){
       x = 1/x;
       sn = -sn; 
    }
    return fastPow(x,sn)    
}
//recursion split sub problem
public double fastPow(double x,double n){
    if(n == 0){
        return 1.0;
    }
    //split problem
    double half = fastPow(x,n/2);
    if(n % 2 == 1){
        return half * half * x;
    }else{
        return half * half;
    }
}
```



