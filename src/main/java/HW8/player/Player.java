package player;

import constant.Dot;

import javax.swing.*;

public abstract class Player {
    String dot;

    private static boolean next;

    Player(String dot) {

        this.dot = dot;
    }

    @Override
    public String toString() {
        return "Player{" +
                "dot='" + dot + '\'' +
                '}';
    }

    public abstract void turn(JButton btn);

    public String getChar() {
        return dot;
    }
}
