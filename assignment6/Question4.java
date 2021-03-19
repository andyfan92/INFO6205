package assignment6;

import java.util.ArrayList;
import java.util.List;

class Question4 {
    public List<String> generateParenthesis(int n) {
        List<String> res = new ArrayList<>();
        backtrack(res, "", n, n);
        return res;
    }

    public void backtrack(List<String> res, String cur, int left, int right) {
        if (left > right) {
            return;
        }

        if (left == 0 && right == 0) {
            res.add(cur);
        }

        if (left > 0) {
            backtrack(res, cur + "(", left - 1, right);
        }

        if (right > 0) {
            backtrack(res, cur + ")", left, right - 1);
        }


    }
}
