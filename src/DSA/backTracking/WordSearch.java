package DSA.backTracking;

import java.util.Arrays;

/*
Given an m x n grid of characters board and a string word, return true if word exists in the grid.

The word can be constructed from letters of sequentially adjacent cells, where adjacent cells are horizontally or vertically neighboring. The same letter cell may not be used more than once.



Example 1:


Input: board = [["A","B","C","E"],["S","F","C","S"],["A","D","E","E"]], word = "ABCCED"
Output: true
Example 2:


Input: board = [["A","B","C","E"],["S","F","C","S"],["A","D","E","E"]], word = "SEE"
Output: true
Example 3:


Input: board = [["A","B","C","E"],["S","F","C","S"],["A","D","E","E"]], word = "ABCB"
Output: false


Constraints:

m == board.length
n = board[i].length
1 <= m, n <= 6
1 <= word.length <= 15
board and word consists of only lowercase and uppercase English letters.


Follow up: Could you use search pruning to make your solution faster with a larger board?

 */
public class WordSearch {
    private boolean findWord(char[][] board,String word,boolean[][] vis,int idx,int i,int j){
        if(idx == word.length()){
            return true;
        }
        if(i<0 || i>=board.length || j<0 || j>=board[0].length || vis[i][j]==true || word.charAt(idx)!=board[i][j]){
            return false;
        }
        vis[i][j]=true;
        boolean result = (findWord(board,word,vis,idx+1,i+1,j) ||
                         findWord(board,word,vis,idx+1,i-1,j) ||
                         findWord(board,word,vis,idx+1,i,j+1) ||
                         findWord(board,word,vis,idx+1,i,j-1));
        vis[i][j]=false;
        return result;
    }
    public  boolean exist(char[][] board, String word) {
        int m = board.length,n=board[0].length;
        boolean[][] vis = new boolean[m][n];
        for(boolean[] a : vis){
            Arrays.fill(a,false);
        }
        int idx=0;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                idx=0;
              if(vis[i][j]==false && board[i][j]==word.charAt(idx)){
                  if(findWord(board,word,vis,idx,i,j)==true){
                      return true;
                  }
              }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        WordSearch wordSearch = new WordSearch();
        char[][] board = {{'A','B','C','E'},{'S','F','C','S'},{'A','D','E','E'}};
        String word = "ABCCEDF";
        System.out.println(wordSearch.exist(board,word));
    }
}
