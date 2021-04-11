package dz8;

import constant.Dot;
import logic.Game;
import player.Human;
import player.PC;

import javax.swing.*;

public class Dz8 {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new Game(new Human(Dot.X.getDot()), new PC(Dot.O.getDot())));
    }
}
