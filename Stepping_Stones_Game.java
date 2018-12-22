/*
Stepping Stones Game
====================
Bob sees his younger brother, Jack, playing Stepping Stones. 
He is fascinated by the most interesting game and decides to play it.

Square boxes have been made on the ground with the help of chalk powder, and a number is assigned to each block. 
Bob is standing in front of these blocks. From here, he will throw a stone 1 block far, move to that block; 
pick up the stone and then he will throw the stone two blocks far from here,
move to that block; 
pick up the stone, and throw the stone three blocks far from here, move to that block, and so on. 
What's the catch of the game??. The catch of the game is to check if it is possible to reach  block in this manner.

Bob is a bit lazy. He will make a move only if he is sure that he can reach the  block. 

So, tell him if he should make a move or not?

Input Format 
First line of input contains an integer T denoting the number of times Bob plays this game. 
Each of the next N lines contains a single integer  denoting the Nth block.

Output Format 
Output consists of several lines as per the following criteria: 
If bob is able to reach Nth block, then print Go On Bob with the number of moves required to reach to the Nth  block both separated by a space. 
If Bob is not able to reach the Nth block, then print Better Luck Next Time.
*/

import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class Solution {

    // Complete the solve function below.
    static String solve(long n) {
        long temp;
        
        temp = (2 * n);

        temp = (long)Math.sqrt((double)temp);

        if( temp * (temp + 1) == 2 * n)
        {
            return "Go On Bob " + Long.toString(temp);
        }
        else
        {
            return "Better Luck Next Time";
        }
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int t = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int tItr = 0; tItr < t; tItr++) {
            long n = scanner.nextLong();
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            String result = solve(n);

            bufferedWriter.write(result);
            bufferedWriter.newLine();
        }

        bufferedWriter.close();

        scanner.close();
    }
}
