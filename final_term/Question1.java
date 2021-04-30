package final_term;

////time complexity O(N) space complexity O(N)
public class Question1 {
    public String getResult(char[][] body, int maxTime){
        if (body == null || body.length == 0) {
            return "can infect";
        }


        boolean flag = dfs (0, 0, body, maxTime);

        if (flag == true) {
            return "can infect";
        } else {
            return "cannot infect";
        }


    }

    public boolean dfs (int curRow, int curCols, char[][] body, int maxTime) {

        int rows = body.length;
        int cols = body[0].length;

        if (maxTime < 0) {
            return false;
        }
        if (curRow == rows - 1 && curCols == cols - 1) {
            return true;
        }

        boolean right = false, left = false, up = false, down = false;
        if (curRow + 1 < rows && body[curRow + 1][curCols] == '0') {
            right = dfs(curRow + 1, curCols, body, maxTime - 1);
        }

        if (curCols + 1 < cols && body[curRow][curCols + 1] == '0') {
            down = dfs(curRow, curCols + 1, body, maxTime - 1);
        }

        if (curRow - 1 >= 0 && body[curRow - 1][curCols] == '0') {
            left = dfs(curRow - 1, curCols, body, maxTime - 1);
        }

        if (curCols - 1 >= 0 && body[curRow][curCols - 1] == '0') {
            up = dfs(curRow, curCols - 1, body, maxTime - 1);
        }

        return right || left || up || down;

    }

    public static void main(String[] args) {
        Question1 question1 = new Question1();
        char [][] body  = {{'0','0','X','0'}, {'X','0','X','X'}, {'X','0','0','0'}};
        System.out.println(question1.getResult(body, 5));
    }
}
