package player;

import constant.Dot;

import javax.swing.*;

public class Human extends Player {

    public Human(String dot) {
        super(dot);
    }

    @Override
    public void turn(JButton btn) {

        btn.setText(dot);

    }
}
