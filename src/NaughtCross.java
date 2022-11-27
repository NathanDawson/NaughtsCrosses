import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.awt.EventQueue;

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
    }
}
