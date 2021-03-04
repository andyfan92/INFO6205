package assignment5;

import java.util.HashSet;

class Question2 {
    public int[] intersection(int[] nums1, int[] nums2) {

        HashSet<Integer> nums1Set = new HashSet<>();

        HashSet<Integer> intersection = new HashSet<>();
        for (int i = 0; i < nums1.length; i++) {
            nums1Set.add(nums1[i]);
        }

        for (int i = 0; i < nums2.length; i++) {
            if (nums1Set.contains(nums2[i])) {
                intersection.add(nums2[i]);
            }
        }

        int[] res = new int[intersection.size()];
        int i = 0;
        for (int number : intersection) {
            res[i] = number;
            i++;
        }
        return res;
    }


}
