package final_term;

//time complexity O(N) space complexity O(N)
public class Question2 {

    public int fib(int n){
        if(n < 0 ){
            return  Integer.MIN_VALUE;
        }
        if( n <= 1 ){
            return n;
        }
        int[] tab = new int[n+1];
        tab[0] = 0;
        tab[1] = 1;

        for(int i = 2; i < tab.length; i ++){
            tab[i] = tab[i-1] + tab[i-2];
        }
        return tab[n];
    }

    public static void main(String[] args) {
        Question2 question2 = new Question2();
        int res = question2.fib(4);
        System.out.println(res);
    }
}
