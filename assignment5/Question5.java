package assignment5;

import java.util.Arrays;
import java.util.stream.Collectors;

public class Question5 {

    int countOnes(int arr[], int left, int right)
    {

        int begin = left;
        while (left < right) {
            int mid = (left + right) / 2;

            if (arr[right] == 0) {
                return 0;
            }

            if (mid == right) {
                if (arr[mid] == 1) {
                    return mid - begin + 1;
                } else {
                    return mid - begin;
                }
            }

            if (arr[mid] == 1 && arr[mid + 1] == 0) {
                return mid - begin + 1;
            }
            if (arr[mid] == 1) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }
        return 0;
    }
}
