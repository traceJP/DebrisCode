/*
有一堆石头，每块石头的重量都是正整数。
每一回合，从中选出两块 最重的 石头，然后将它们一起粉碎。假设石头的重量分别为 x 和 y，且 x <= y。那么粉碎的可能结果如下：
如果 x == y，那么两块石头都会被完全粉碎；
如果 x != y，那么重量为 x 的石头将会完全粉碎，而重量为 y 的石头新重量为 y-x。
最后，最多只会剩下一块石头。返回此石头的重量。如果没有石头剩下，就返回 0。
示例：
输入：[2,7,4,1,8,1]
输出：1
解释：
先选出 7 和 8，得到 1，所以数组转换为 [2,4,1,1,1]，
再选出 2 和 4，得到 2，所以数组转换为 [2,1,1,1]，
接着是 2 和 1，得到 1，所以数组转换为 [1,1,1]，
最后选出 1 和 1，得到 0，最终数组转换为 [1]，这就是最后剩下那块石头的重量。
*/
package LeetCode;

public class no1046 {
    public static void main(String[] args) {
        int[] n = new int[]{2, 7, 4, 1, 8, 1};
        //System.out.println(lastStoneWeight(n));
    }


}


/*
如何找到数组第二大的值：
如果数组元素的值比最大变量的值大，则将第二大变量的值更新为最大变量的值，最大变量的值更新为该元素的值；
如果数组元素的值比最大变量的值小，则判断该数组元素的值是否比第二大变量的值大，如果大，则更新第二大变量的值为该数组元素的值。
*/

/*
 class Solution {
    public int lastStoneWeight(int[] stones) {
        int n=stones.length;
        if(n==1) return stones[0];
        if(n==0) return 0;
        Arrays.sort(stones);    //对数组进行升序排序

        while(stones[n-2]!=0){
            if(stones[n-1]==stones[n-2]){
                stones[n-1]=0;
                stones[n-2]=0;
            }else{
                stones[n-1]=stones[n-1]-stones[n-2];
                stones[n-2]=0;
            }
            Arrays.sort(stones);
        }
        return stones[n-1];
    }
}
*/