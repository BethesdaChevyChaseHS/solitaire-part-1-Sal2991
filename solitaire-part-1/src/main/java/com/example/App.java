package com.example;

import javax.swing.*;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class App {
    public static void main(String[] args) { 
      JFrame frame = new JFrame("Solitaire");
      
      // Set
      frame.setLayout(new BorderLayout());
      frame.setSize(1200,600);
      frame.setVisible(true);

      // North
      JPanel panel_N = new JPanel();
      JLabel label_N = new JLabel("My Solitaire");
      panel_N.add(label_N);
      frame.add(panel_N, BorderLayout.NORTH);

      // South
      JPanel panel_S = new JPanel();
      JLabel label_S = new JLabel("South");
      panel_S.add(label_S);
      frame.add(panel_S, BorderLayout.SOUTH);

      // East
      JPanel panel_E = new JPanel();
      JLabel label_E = new JLabel("East");
      panel_E.add(label_E);
      frame.add(panel_E, BorderLayout.EAST);

      // West
      JPanel panel_W = new JPanel();
      JLabel label_W = new JLabel("Pile");
      panel_W.add(label_W);
      frame.add(panel_W, BorderLayout.WEST);
      
      // Center
      JPanel playArea = new JPanel();
      playArea.setLayout(new GridLayout(1,7));
      for (int i = 1; i < 8; i++){
        JPanel Stack = new JPanel();
        JLabel stackLabel = new JLabel("Stack " + i);
        Stack.add(stackLabel);
        playArea.add(Stack);
      }
      frame.add(playArea, BorderLayout.CENTER);
      
    }
}