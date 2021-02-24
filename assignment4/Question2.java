package assignment4;

class Question2 {
    public int findKthSmallest(int[] nums, int k) {
        return findKthSmallest(nums, 0, nums.length - 1, k);
    }

    private int findKthSmallest(int[] nums, int low, int high, int k) {
        int pivot = low;
        for (int i = low; i < high; i++) {
            if (nums[i] <= nums[high]) {
                swap(nums, i, pivot);
                pivot++;
            }
        }
        swap(nums, pivot, high);
        int rank = pivot - low + 1;
        if (rank == k) return nums[pivot];
        if (rank > k) return findKthSmallest(nums, low, pivot - 1, k);
        return findKthSmallest(nums, pivot + 1, high, k - rank);
    }
    private static  void swap(int[] arr, int i , int j){
        if( arr == null || arr.length < 2 || i < 0 || j < 0 || i >= arr.length || j >= arr.length){
            return;
        }
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
