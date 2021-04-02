package mid_term.Question4;

//time complexity O(log(N)) space complexity O(1)
public class Solution {
    public int getIndex(int[] nums, int x){
        int left = 0;
        int right = nums.length - 1;
        int res = -1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (x == nums[mid]) {
                res = mid;
                right = mid - 1;
            } else if (x < nums[mid]) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[] obj = new int[] {2,4,4,4,6,7,7,7,8,9,9};
        Solution solution = new Solution();
        int res = solution.getIndex(obj, 7);
        System.out.println(res);

    }
}
