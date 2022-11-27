import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.EventQueue;

import java.awt.*;
import java.awt.event.*;

public class NaughtCross {
    
    private JFrame frame;
    private JTextField xCount;
    private JTextField oCount;
    private int xCount1 = 0;
    private int oCount1 = 0;
    private String startGame = "X";
    private int b1 = 10;
    private int b2 = 10;
    private int b3 = 10;
    private int b4 = 10;
    private int b5 = 10;
    private int b6 = 10;
    private int b7 = 10;
    private int b8 = 10;
    private int b9 = 10;
    private int i = 0;

    public static void main(String[] args){
        EventQueue.invokeLater(new Runnable() {
            public void run(){
                try{
                    NaughtCross window = new NaughtCross();
                    window.frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public NaughtCross(){
        initialize();
        }

    private void winningGame(){

        // For Player X to win
        if (b1 == 1 && b2 == 1 && b3 == 1){
            JOptionPane.showMessageDialog(frame, "Player X Wins", "Naughts & Crosses", JOptionPane.INFORMATION_MESSAGE);
            xCount1++;
            xCount.setText(String.valueOf(xCount1));
        }
        else if (b4 == 1 && b5 == 1 && b6 == 1){
            JOptionPane.showMessageDialog(frame, "Player X Wins", "Naughts & Crosses", JOptionPane.INFORMATION_MESSAGE);
            xCount1++;
            xCount.setText(String.valueOf(xCount1));
        }
        else if (b7 == 1 && b8 == 1 && b9 == 1){
            JOptionPane.showMessageDialog(frame, "Player X Wins", "Naughts & Crosses", JOptionPane.INFORMATION_MESSAGE);
            xCount1++;
            xCount.setText(String.valueOf(xCount1));
        }
        else if (b1 == 1 && b4 == 1 && b7 == 1){
            JOptionPane.showMessageDialog(frame, "Player X Wins", "Naughts & Crosses", JOptionPane.INFORMATION_MESSAGE);
            xCount1++;
            xCount.setText(String.valueOf(xCount1));
        }
        else if (b2 == 1 && b5 == 1 && b8 == 1){
            JOptionPane.showMessageDialog(frame, "Player X Wins", "Naughts & Crosses", JOptionPane.INFORMATION_MESSAGE);
            xCount1++;
            xCount.setText(String.valueOf(xCount1));
        }
        else if (b3 == 1 && b6 == 1 && b9 == 1){
            JOptionPane.showMessageDialog(frame, "Player X Wins", "Naughts & Crosses", JOptionPane.INFORMATION_MESSAGE);
            xCount1++;
            xCount.setText(String.valueOf(xCount1));
        }
        else if (b1 == 1 && b5 == 1 && b9 == 1){
            JOptionPane.showMessageDialog(frame, "Player X Wins", "Naughts & Crosses", JOptionPane.INFORMATION_MESSAGE);
            xCount1++;
            xCount.setText(String.valueOf(xCount1));
        }
        else if (b3 == 1 && b5 == 1 && b7 == 1){
            JOptionPane.showMessageDialog(frame, "Player X Wins", "Naughts & Crosses", JOptionPane.INFORMATION_MESSAGE);
            xCount1++;
            xCount.setText(String.valueOf(xCount1));
        }

        // For Player O to win
        else if (b1 == 0 && b2 == 0 && b3 == 0){
            JOptionPane.showMessageDialog(frame, "Player O Wins", "Naughts & Crosses", JOptionPane.INFORMATION_MESSAGE);
            oCount1++;
            oCount.setText(String.valueOf(oCount1));
        }
        else if (b4 == 0 && b5 == 0 && b6 == 0){
            JOptionPane.showMessageDialog(frame, "Player O Wins", "Naughts & Crosses", JOptionPane.INFORMATION_MESSAGE);
            oCount1++;
            oCount.setText(String.valueOf(oCount1));
        }
        else if (b7 == 0 && b8 == 0 && b9 == 0){
            JOptionPane.showMessageDialog(frame, "Player O Wins", "Naughts & Crosses", JOptionPane.INFORMATION_MESSAGE);
            oCount1++;
            oCount.setText(String.valueOf(oCount1));
        }
        else if (b1 == 0 && b4 == 0 && b7 == 0){
            JOptionPane.showMessageDialog(frame, "Player O Wins", "Naughts & Crosses", JOptionPane.INFORMATION_MESSAGE);
            oCount1++;
            oCount.setText(String.valueOf(oCount1));
        }
        else if (b2 == 0 && b5 == 0 && b8 == 0){
            JOptionPane.showMessageDialog(frame, "Player O Wins", "Naughts & Crosses", JOptionPane.INFORMATION_MESSAGE);
            oCount1++;
            oCount.setText(String.valueOf(oCount1));
        }
        else if (b3 == 0 && b6 == 0 && b9 == 0){
            JOptionPane.showMessageDialog(frame, "Player O Wins", "Naughts & Crosses", JOptionPane.INFORMATION_MESSAGE);
            oCount1++;
            oCount.setText(String.valueOf(oCount1));
        }
        else if (b1 == 0 && b5 == 0 && b9 == 0){
            JOptionPane.showMessageDialog(frame, "Player O Wins", "Naughts & Crosses", JOptionPane.INFORMATION_MESSAGE);
            oCount1++;
            oCount.setText(String.valueOf(oCount1));
        }
        else if (b3 == 0 && b5 == 0 && b7 == 0){
            JOptionPane.showMessageDialog(frame, "Player O Wins", "Naughts & Crosses", JOptionPane.INFORMATION_MESSAGE);
            xCount1++;
            xCount.setText(String.valueOf(oCount1));
        }

        // No Players Win
        else if (i == 9){
            JOptionPane.showMessageDialog(frame, "No One Wins", "Naughts & Crosses", JOptionPane.INFORMATION_MESSAGE);
        }
    }
    private void choosePlayer(){
        if(startGame.equalsIgnoreCase("X")){
            startGame = "O";
        } else {
            startGame = "X";
        }
    }

    private void initialize() {
        frame = new JFrame();
        frame.setBounds(100, 100, 600, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setLayout(new java.awt.BorderLayout(0, 0));

        JPanel panel = new JPanel();
        panel.setBorder(new LineBorder(new Color(0, 0, 0), 2));
        frame.getContentPane().add(panel, BorderLayout.CENTER);
        panel.setLayout(new GridLayout(3, 5, 2, 2));

        JPanel panel_1 = new JPanel();
        panel_1.setBorder(new LineBorder(new Color(0, 0, 0), 2));
        panel.add(panel_1);
        panel_1.setLayout(new BorderLayout(0, 0));

        JButton btn1 = new JButton("");
        btn1.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent arg0){
                btn1.setText(startGame);
                if(startGame.equalsIgnoreCase("X")){
                    btn1.setForeground(Color.RED);
                    b1 = 1;
                    i++;
                } else {
                    btn1.setForeground(Color.BLUE);
                    b1 = 0;
                    i++;
                }
                choosePlayer();
                winningGame();
            }
        });
        btn1.setFont(new Font("Tahoma", Font.BOLD, 80));
        panel_1.add(btn1, BorderLayout.CENTER);

        JPanel panel_2 = new JPanel();
        panel_2.setBorder(new LineBorder(new Color(0, 0, 0), 2));
        panel.add(panel_2);
        panel_2.setLayout(new BorderLayout(0, 0));

        JButton btn2 = new JButton("");
        btn2.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent arg0){
                btn2.setText(startGame);
                if(startGame.equalsIgnoreCase("X")){
                    btn2.setForeground(Color.RED);
                    b2 = 1;
                    i++;
                } else {
                    btn2.setForeground(Color.BLUE);
                    b2 = 0;
                    i++;
                }
                choosePlayer();
                winningGame();
            }
        });
        btn2.setFont(new Font("Tahoma", Font.BOLD, 80));
        panel_2.add(btn2, BorderLayout.CENTER);

        JPanel panel_3 = new JPanel();
        panel_3.setBorder(new LineBorder(new Color(0, 0, 0), 2));
        panel.add(panel_3);
        panel_3.setLayout(new BorderLayout(0, 0));

        JButton btn3 = new JButton("");
        btn3.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent arg0){
                btn3.setText(startGame);
                if(startGame.equalsIgnoreCase("X")){
                    btn3.setForeground(Color.RED);
                    b3 = 1;
                    i++;
                } else {
                    btn3.setForeground(Color.BLUE);
                    b3 = 0;
                    i++;
                }
                choosePlayer();
                winningGame();
            }
        });
        btn3.setFont(new Font("Tahoma", Font.BOLD, 80));
        panel_3.add(btn3, BorderLayout.CENTER);

    }
}
