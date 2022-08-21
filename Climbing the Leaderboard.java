/*
An arcade game player wants to climb to the top of the leaderboard and track their ranking. The game uses Dense Ranking, so its leaderboard works like this:

The player with the highest score is ranked number  on the leaderboard.
Players who have equal scores receive the same ranking number, and the next player(s) receive the immediately following ranking number.
Example

The ranked players will have ranks , , , and , respectively. If the player’s scores are ,  and , their rankings after each game are ,  and . Return .

Function Description

Complete the climbingLeaderboard function in the editor below.

climbingLeaderboard has the following parameter(s):

int ranked[n]: the leaderboard scores
int player[m]: the player’s scores
Returns

int[m]: the player’s rank after each new score
Input Format

The first line contains an integer , the number of players on the leaderboard.
The next line contains  space-separated integers , the leaderboard scores in decreasing order.
The next line contains an integer, , the number games the player plays.
The last line contains  space-separated integers , the game scores.

 */
 
 import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] scores = new int[n];
        for(int scores_i=0; scores_i < n; scores_i++){
            scores[scores_i] = in.nextInt();
        }
        int m = in.nextInt();
        int[] alice = new int[m];
        for(int alice_i=0; alice_i < m; alice_i++){
            alice[alice_i] = in.nextInt();
        }
        printScores(n, scores, alice);
    }
    
    public static void printScores(int n, int[] scores, int[] alice){
        ArrayList<Integer> places = new ArrayList<Integer>();
        int place = 1;
        places.add(scores[0]);
        for(int i = 1; i < scores.length; i++){
            int currPlace = place-1;
            int currScore = scores[i];
            if(currScore != places.get(currPlace)){
                place++;
                places.add(currScore);
            }
        }
        
        int currPlace = places.size() + 1;
        for(int i = 0; i < alice.length; i++){
            currPlace = getPlace(currPlace, alice[i], places);
            System.out.println(currPlace);
        }
        
    }
    
    public static int getPlace(int currPlace, int currScore, ArrayList<Integer> places){
        for(int i = currPlace - 1; i > 0; i--){
            int index = i - 1;
            if(currScore < places.get(index)){
                return i + 1;
            }
        }
        return 1;
    }
}
