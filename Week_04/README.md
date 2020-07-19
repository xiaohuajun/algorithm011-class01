## 深度优先搜索

回溯法的一种应用

1、递归写法

> 1.terminator
>
> 2.handle current logic
>
> 3.drill down
>
> 4.reverse states

#### [104. 二叉树的最大深度](https://leetcode-cn.com/problems/maximum-depth-of-binary-tree/)

```java
//二叉树的最大深度:从根节点的出发，到最远节点的路径上节点数之和 
public int maxHeight(TreeNode root){
      if(root == null){
          return 0;
      }else{
          int leftHeight = maxHeight(root.left);
          int rightHeiht = maxHeight(root.right);
          return Math.max(leftHeight,rightHeiht) + 1
      }
}
```



2、迭代法

>1.利用栈的特性

### 二分查找

conditions-必备条件:

> 单调性（单调递增或者递减）
>
> 存在左右边界
>
> 可以通过index访问

code template-代码模板：

```java
//单调递增的
int nums[];
int l = 0;
int r = nums.length - 1;
while(l <= r){
     //防止溢出-整型[-2^31,2^31-1]
	 int mid  = l + (r-l)/2;
    //find target 	
     if(nums[mid]==target){
         return mid;
     }else if(nums[mid] < target){
         l = mid + 1;
     }else {
         r = mid - 1;
     }
}
```

example：

#### [35. 搜索插入位置](https://leetcode-cn.com/problems/search-insert-position/)

description:

>给定一个排序数组和一个目标值，在数组中找到目标值，并返回其索引。如果目标值不存在于数组中，返回它将会被按顺序插入的位置。你可以假设数组中无重复元素。

analysis:

>二分查询有点区别：
>
>如果不存目标数组中的，则返回插入的索引：target
>
>pos = n[pos - 1] < target < n[pos] 
>
>如果存在
>
>pos  = target = n[pos]
>
>综上所述：
>
>pos = n[pos - 1] < target <= n[pos]
>
>怎么初始化pos？
>
>如果一个数比所有的数都要大，那么他的位置就是最后一个位置，就 n.length; 

code:

```java
public int findInsertIndex(int nums[],int target){
    int len = nums.length;
    int left = 0;
    int right = len - 1;
    int pos = len;
    while(left <= right){
        int mid = l + (r - l)/2;
        if(target <= nums[mid]){
            pos = mid;
            r = mid - 1;
        }else if(target > nums[mid]){
            l = mid + 1;
        }
    }
    return pos;
}
```

## 牛顿迭代法

>在迭代过程中，以直线代替曲线，求与x的交点，重复这个过程直到收敛（汇聚一点，趋近与某个值）
>
>一定要考虑两个问题：
>
>1、函数是否收敛
>
>2、收敛的解是不是我想想要的

tp:收敛:逐渐汇聚一点，向某一个值靠近

tp:一阶泰勒：点的切线

tp：求导

>常量求导：y=c(c为常bai数) y'=0
>
>y=x^n --> y'=nx^(n-1)


#### [69. x 的平方根](https://leetcode-cn.com/problems/sqrtx/)

code:

```java
public int sqrt(int a){
    long x = a;
    while(x * x > a){
        x = (x + x/a)/2
    }
    return (int)x;
}
```

