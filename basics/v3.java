import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class v3{
    static String wynik;

    private static void interfejs(){
        JFrame okno = new JFrame("Aplikacja do porównywania liczb");
        okno.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        okno.setSize(300, 200);
        okno.setResizable(false);
        JPanel siatka = new JPanel(new GridBagLayout());
        GridBagConstraints kontener = new GridBagConstraints();
        kontener.insets = new Insets(5, 5, 5, 5); 

        //---------------------------------------------------------
        JLabel lt1 = new JLabel("Podaj liczbę 1: ");
        JTextField liczba1 = new JTextField(10);
        
        //---------------------------------------------------------
        JLabel lt2 = new JLabel("Podaj liczbę 2: ");
        JTextField liczba2 = new JTextField(10);

        //---------------------------------------------------------
        JButton porownaj = new JButton("Porównaj");
        //---------------------------------------------------------
        kontener.gridx = 0;
        kontener.gridy = 0;
        siatka.add(lt1, kontener);

        kontener.gridx = 1;
        kontener.gridy = 0;
        siatka.add(liczba1, kontener);

        kontener.gridx = 0;
        kontener.gridy = 1;
        siatka.add(lt2, kontener);

        kontener.gridx = 1;
        kontener.gridy = 1;
        siatka.add(liczba2, kontener);

        kontener.gridx = 1;
        kontener.gridy = 2;
        siatka.add(porownaj, kontener);

        okno.add(siatka);
        okno.setVisible(true);
        //---------------------------------------------------------

        porownaj.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e){
                try{
                    double num1 = Double.parseDouble(liczba1.getText());
                    double num2 = Double.parseDouble(liczba2.getText());

                    wynik = porownajLiczby(num1, num2);
                    JOptionPane.showMessageDialog(null, wynik);
                }catch(NumberFormatException ex){
                    wynik = "Błąd: wpisz liczby!";
                    JOptionPane.showMessageDialog(null, wynik);
                }
            }
        });
    }

    private static String porownajLiczby(double a, double b){
        if(a > b)  return "Liczba " + Double.toString(a) + " jest większa!";
        else if(a < b) return "Liczba " + Double.toString(b) + " jest większa!";
        else return "Liczby są równe!";
    }
    public static void main(String[] args){
        interfejs();
    }
}
