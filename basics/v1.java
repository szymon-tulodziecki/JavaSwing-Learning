import javax.swing.*;

public class v1{
    public static void main(String[] args){
        JFrame okno = new JFrame("Aplikacja v1");
        
        JButton przycisk = new JButton("Kliknij!");
    
        okno.add(przycisk);
        okno.setSize(300, 200);

        okno.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        okno.setVisible(true);
    }
}