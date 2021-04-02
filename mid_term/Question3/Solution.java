package mid_term.Question3;

//time complexity O(n) space complexity O(1)
public class Solution {
    public int getMaxConsecutiveOnes(int[] nums){
        int res = 0;
        int cnt = 0;
        for (int i : nums) {
            if (i == 1) {
                cnt++;
            } else {
                if (cnt > res) {
                    res = cnt;
                }
                cnt = 0;
            }

        }
        return Math.max(res, cnt);
    }

    public static void main(String[] args) {
        int[] nums = new int[] {0,1,0,1,1,0,1,1,1,0,0,0};
        Solution solution = new Solution();
        int res = solution.getMaxConsecutiveOnes(nums);
        System.out.println(res);
    }

}
