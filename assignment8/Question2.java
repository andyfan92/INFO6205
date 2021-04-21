package assignment8;

import java.util.*;

public class Question2 {
    public boolean canFinish(int numCourses, int[][] prerequisites) {

        List<Integer>[] arr = new List[numCourses];
        Map<Integer, Boolean> dp = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = new ArrayList<>();
        }

        for (int[] temp : prerequisites) {
            arr[temp[0]].add(temp[1]);
        }

        for (int i = 0; i < numCourses; i++) {
            if (!helper(i, arr, new HashSet<>(), dp)) {
                return false;
            }
        }

        return true;

    }

    boolean helper(int course, List<Integer>[] arr, Set<Integer> visited, Map<Integer, Boolean> dp) {

        if (dp.containsKey(course))
            return dp.get(course);
        if (arr[course].size() == 0)
            return true;
        if (visited.contains(course))
            return false;

        visited.add(course);
        for (int next : arr[course]) {
            if (!helper(next, arr, visited, dp)) {
                dp.put(course, false);
                return false;
            }
        }
        dp.put(course, true);
        return true;
    }

    public static void main(String[] args) {
        Question2 question2 = new Question2();
        int[][] pre = {{0,1}, {1,0}};
        boolean res = question2.canFinish(2, pre);
        System.out.println(res);

    }
}
