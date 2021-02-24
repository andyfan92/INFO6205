package assignment4;


import java.util.ArrayList;
import java.util.List;

/*
 * @lc app=leetcode.cn id=969 lang=java
 *
 *
 */

// @lc code=start
class Question4 {
    public List<Integer> pancakeSort(int[] arr) {
        List<Integer> res = new ArrayList<>();
        int size = arr.length;
        for (int i = 0; i < size; i++) {
            int idx = locateTargetIndex(arr, size - i);
            flip(arr, idx);
            flip(arr, size - 1 - i);
            res.add(idx + 1);
            res.add(size - i);
        }
        return res;
    }

    private int locateTargetIndex(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1;
    }


    private void flip (int[] arr, int limit) {
        int i = 0, j = limit;
        while (i < j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }
}
// @lc code=end


