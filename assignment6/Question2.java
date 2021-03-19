package assignment6;

import java.util.LinkedList;
import java.util.Stack;

class Question2 {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> s = new Stack<>();
        for (int i : asteroids) {
            if (i <= 0) {
                while (!s.isEmpty() && s.peek() > 0 && s.peek() < Math.abs(i)) {
                    s.pop();
                }

                if (s.isEmpty() || s.peek() < 0) {
                    s.push(i);
                }

                if (s.peek() + i == 0) {
                    s.pop();
                }
            } else {
                s.push(i);
            }
        }
        return s.stream().mapToInt(i -> i).toArray();
    }
}