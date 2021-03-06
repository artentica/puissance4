package game;

import grid.Column;
import player.Player;

import java.util.Vector;

public interface Interface{  // notre interface
    public abstract void displayGrid(Vector<Column> vct);
    public abstract int nbPlayer();

    public abstract String namePlayer(int i);
    public abstract String symbolePlayer(String name);

    public abstract void checkName(Vector<Player> vct, String name);
    public abstract void checkSymbol(Vector<Player> vct, String symbol);
    public abstract void begin();
    public abstract void end();
    public abstract void winH();
    public abstract void winV();
    public abstract void winDL2UR();
    public abstract void winUL2DR();
    public abstract void fullGrid();
    public abstract void win(String name);

    public abstract boolean finalWinner(Vector<Player> winner, int limit);

    public abstract int numberWinGame(int nbPlayers);

    public abstract void score(Vector<Player> vct, int win, int limit);



    public abstract void turnOf(Player player);

    public abstract int choiceColumn(int max);

    public abstract void columnFull(int column);

    public abstract int nbColumn();

    public abstract boolean choiceGrid();

    public abstract void badRatio();
}