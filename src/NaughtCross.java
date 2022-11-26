import javax.swing.JFrame;
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
}
