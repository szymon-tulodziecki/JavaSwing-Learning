import javax.swing.*;
import java.awt.event.*;

public class v2 {
    private boolean isShowed = false;

    //----------------------------------------------------------
    private void off(JButton przycisk, JLabel tekst){
        przycisk.setText("0");
        tekst.setText("");
        isShowed = false;
    }
    //----------------------------------------------------------
    private void on(JButton przycisk, JLabel tekst){
        przycisk.setText("1");
        tekst.setText("CZEŚĆ!");
        isShowed = true;
    }
    //----------------------------------------------------------

    public static void main(String[] args) {
        JFrame okno = new JFrame("Aplikacja v2");
        JLabel tekst = new JLabel("");
        JButton przycisk = new JButton("0");
        
        v2 app = new v2();

        przycisk.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                if(app.isShowed){
                    app.off(przycisk, tekst);
                }else{
                    app.on(przycisk, tekst);
                }
            }
        });
        
        okno.setLayout(new BoxLayout(okno.getContentPane(), BoxLayout.Y_AXIS));
        okno.add(tekst);
        okno.add(przycisk);
            
        okno.setSize(300, 200);
        okno.setResizable(false);
        okno.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        okno.setVisible(true);
    }
}
