package assignment5;

import java.util.Arrays;
import java.util.stream.Collectors;

public class Question5 {

    int countOnes(int arr[], int left, int right)
    {

        int begin = left;

        if (left == right) {
            if (arr[left] == 0) {
                return 0;
            } else {
                return 1;
            }
        }

        if (arr[left] == 0) {
            return 0;
        }

        if (arr[right] == 1) {
            return right - left + 1;
        }

        while (left < right) {
            int mid = (left + right) / 2;

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
