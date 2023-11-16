package algorithm.programmers;

import javax.sound.midi.Soundbank;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class P178871 {

    static class Solution{
        public int findPlayersIndex(LinkedList<String> players, String calling) {
            return players.indexOf(calling);
        }

        public String[] solution(String[] players, String[] callings) {

            LinkedList<String> playersList = new LinkedList<>(Arrays.asList(players));

            for (int i = 0; i < callings.length; i++) {
                int callingIndex = findPlayersIndex(playersList, callings[i]);

                String temp = players[callingIndex]; // 앞으로갈 사람
                players[callingIndex] = players[callingIndex-1]; // 뒤로갈 사람
                players[callingIndex-1] = temp;
                playersList = new LinkedList<>(Arrays.asList(players));
            }


            return players;
        }
    }
    public static void main(String args[]){
        Solution solutionClass = new Solution();
        System.out.println("result : ->" + solutionClass.solution(new String[]{"mumu", "soe", "poe", "kai", "mine"}, new String[]{"kai", "kai", "mine", "mine"}));
    }

}
