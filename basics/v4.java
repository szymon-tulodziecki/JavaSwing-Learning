import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class v4 {
    static String w1;

    private static void calculator(){
        JFrame mainWindow = new JFrame("Prosty kalkulator");
        mainWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainWindow.setSize(600, 400);
        mainWindow.setResizable(false);
        JPanel grid = new JPanel(new GridBagLayout());
        GridBagConstraints cont = new GridBagConstraints();
        cont.insets = new Insets(5, 5, 5, 5);

        //------------------------------------------------------------
        JTextField a = new JTextField(10);
        JLabel plus = new JLabel(" + ");
        JTextField b = new JTextField(10);
        JButton w1 = new JButton(" = ");
        JLabel sw1 = new JLabel();
        
        cont.gridx = 0;
        cont.gridy = 0;
        grid.add(a, cont);

        cont.gridx = 1;
        cont.gridy = 0;
        grid.add(plus, cont);

        cont.gridx = 2;
        cont.gridy = 0;
        grid.add(b, cont);

        cont.gridx = 3;
        cont.gridy = 0;
        grid.add(w1, cont);
        
        cont.gridx = 4;
        cont.gridy = 0;
        grid.add(sw1, cont);

        w1.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                try{
                    double num1 = Double.parseDouble(a.getText());
                    double num2 = Double.parseDouble(b.getText());

                    sw1.setText(Double.toString(num1 + num2));
                }catch(NumberFormatException ex){
                    JOptionPane.showMessageDialog(null, ex);
                }
            }
        });

        //------------------------------------------------------------
                JTextField c = new JTextField(10);
                JLabel minus = new JLabel(" - ");
                JTextField d = new JTextField(10);
                JButton w2 = new JButton(" = ");
                JLabel sw2 = new JLabel();
                
                cont.gridx = 0;
                cont.gridy = 1;
                grid.add(c, cont);
        
                cont.gridx = 1;
                cont.gridy = 1;
                grid.add(minus, cont);
        
                cont.gridx = 2;
                cont.gridy = 1;
                grid.add(d, cont);
        
                cont.gridx = 3;
                cont.gridy = 1;
                grid.add(w2, cont);
                
                cont.gridx = 4;
                cont.gridy = 1;
                grid.add(sw2, cont);
        
                w2.addActionListener(new ActionListener(){
                    @Override
                    public void actionPerformed(ActionEvent e){
                        try{
                            double num1 = Double.parseDouble(c.getText());
                            double num2 = Double.parseDouble(d.getText());
        
                            sw2.setText(Double.toString(num1 - num2));
                        }catch(NumberFormatException ex){
                            JOptionPane.showMessageDialog(null, ex);
                        }
                    }
                });

        //------------------------------------------------------------
        JTextField ee = new JTextField(10);
        JLabel mult = new JLabel(" * ");
        JTextField f = new JTextField(10);
        JButton w3 = new JButton(" = ");
        JLabel sw3 = new JLabel();
        
        cont.gridx = 0;
        cont.gridy = 2;
        grid.add(ee, cont);

        cont.gridx = 1;
        cont.gridy = 2;
        grid.add(mult, cont);

        cont.gridx = 2;
        cont.gridy = 2;
        grid.add(f, cont);

        cont.gridx = 3;
        cont.gridy = 2;
        grid.add(w3, cont);
        
        cont.gridx = 4;
        cont.gridy = 2;
        grid.add(sw3, cont);

        w3.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                try{
                    double num1 = Double.parseDouble(ee.getText());
                    double num2 = Double.parseDouble(f.getText());

                    sw3.setText(Double.toString(num1 * num2));
                }catch(NumberFormatException ex){
                    JOptionPane.showMessageDialog(null, ex);
                }
            }
        });

        //------------------------------------------------------------
                JTextField g = new JTextField(10);
                JLabel div = new JLabel(" / ");
                JTextField h = new JTextField(10);
                JButton w4 = new JButton(" = ");
                JLabel sw4 = new JLabel();
                
                cont.gridx = 0;
                cont.gridy = 3;
                grid.add(g, cont);
        
                cont.gridx = 1;
                cont.gridy = 3;
                grid.add(div, cont);
        
                cont.gridx = 2;
                cont.gridy = 3;
                grid.add(h, cont);
        
                cont.gridx = 3;
                cont.gridy = 3;
                grid.add(w4, cont);
                
                cont.gridx = 4;
                cont.gridy = 3;
                grid.add(sw4, cont);
        
                w4.addActionListener(new ActionListener(){
                    @Override
                    public void actionPerformed(ActionEvent e){
                        try {
                            double num1 = Double.parseDouble(g.getText());
                            double num2 = Double.parseDouble(f.getText());
                            
                            if (num2 == 0) {
                                JOptionPane.showMessageDialog(null, "Dzielnik nie może być równy 0!", "Błąd", JOptionPane.WARNING_MESSAGE);
                                return;
                            }   
                            
                            sw4.setText(Double.toString(num1 / num2));
                        } catch (NumberFormatException ex) {
                            JOptionPane.showMessageDialog(null, "Błąd: Wprowadź poprawne liczby!", "Błąd", JOptionPane.ERROR_MESSAGE);
                        }
                    }
                });
                
        //------------------------------------------------------------
        mainWindow.add(grid);
        mainWindow.setVisible(true);
    }

    public static void main(String[] args) {
        calculator();
    }
}
