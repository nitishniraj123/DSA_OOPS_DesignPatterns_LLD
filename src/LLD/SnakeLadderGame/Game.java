package LLD.SnakeLadderGame;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

public class Game {
    Board board;
    Dice dice;
    Deque<Player> playerList=new LinkedList<>();
    Player winner = null;
    public Game() {
        initializeGame();
    }

    private void initializeGame(){
        board = new Board(10,5,6);
        dice = new Dice(1);
        winner = null;
        addPlayers();
    }

    private void addPlayers(){
        Player p1 = new Player("p1",0);
        Player p2 = new Player("p2",0);
        playerList.add(p1);
        playerList.add(p2);
    }

    public void startGame(){

    }

    private Player findPlayerTurn(){
        Player player = playerList.removeFirst();
        playerList.addLast(player);
        return player;
    }

    private int jumpCheck(int playerNewPosition){


        return playerNewPosition;
    }

}
