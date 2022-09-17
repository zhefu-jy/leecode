package SwordFingerOffer;

/**
 * 剑指 Offer II 057. 值和下标之差都在给定的范围内
 * 给你一个整数数组 nums 和两个整数 k 和 t 。请你判断是否存在 两个不同下标 i 和 j，使得 abs(nums[i] - nums[j]) <= t ，同时又满足 abs(i - j) <= k 。
 * 如果存在则返回 true，不存在返回 false
 * 示例 1：
 * 输入：nums = [1,2,3,1], k = 3, t = 0
 * 输出：true
 * 示例 2：
 *
 * 输入：nums = [1,0,1,1], k = 1, t = 2
 * 输出：true
 * 示例 3：
 *
 * 输入：nums = [1,5,9,1,5,9], k = 2, t = 3
 * 输出：false
 */
public class leetcode44 {
    public static void main(String[] args) {
        int []nums=new int[]{2147483646,2147483647};

        int k=3;
        int t=3;
        System.out.println(containsNearbyAlmostDuplicate(nums, k, t));

    }
    public static  boolean containsNearbyAlmostDuplicate(int[] nums, int k, int t) {
        for (int i = 0; i <nums.length-1 ; i++) {
            for (int j = i+1; j < i+1+k && j<nums.length; j++) {
                if(Math.abs((long)nums[j]-(long)nums[i])<=t){
                    return true;
                }
            }
        }
        return false;

    }
}
