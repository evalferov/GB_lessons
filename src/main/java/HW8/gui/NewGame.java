package gui;

import logic.Game;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class NewGame extends JPanel {
    private Game game;
    private JButton btn;

    public NewGame(Game game) {
        this.game = game;
        setLayout(new FlowLayout());
        this.btn = new JButton("Ещё раз");
        btn.addActionListener(new BtnListener());
        add(btn);
    }


    private class BtnListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            game.emptyBoard();

        }
    }
}
