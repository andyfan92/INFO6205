package assignment8;

import java.util.*;
import java.util.stream.Collectors;

public class Question3 {
    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        Set<String> set = wordList.stream().collect(Collectors.toSet());
        if(!set.contains(endWord)){
            return 0;
        }

        Queue<String> queue = new LinkedList<>();
        queue.add(beginWord);
        int distance=1, len=0;

        while(!queue.isEmpty()){
            len = queue.size();
            distance++;

            for(int i=0; i< len; i++){
                String current = queue.remove();
                for(int j=0; j< current.length();j++){
                    for(char c = 'a'; c <= 'z';c++){
                        String newWord = current.substring(0,j)+ c + current.substring(j+1);
                        if(endWord.equals(newWord)){
                            return distance;
                        }
                        if(current.equals(newWord)){
                            continue;
                        }
                        if(set.contains(newWord) && set.size() >0){
                            queue.add(newWord);
                            set.remove(newWord);
                        }
                    }
                }

            }
        }

        return set.size() == 0 ? distance : 0;
    }


    public static void main(String[] args) {
        Question3 question3 = new Question3();
        int res = question3.ladderLength("hit", "cog", Arrays.asList("hot","dot","dog","lot","log","cog"));
        System.out.println(res);
    }
}
