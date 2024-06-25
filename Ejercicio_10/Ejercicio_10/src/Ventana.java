import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ventana extends JFrame{
    private JLabel titulo;
    private JLabel descripcion;
    private JTextField numero;
    private JButton intentarButton;
    private JPanel panel1;

    public Ventana(){
        super("Adivinador");

        Adivinador adivinador = new Adivinador();
        setContentPane(panel1);

        intentarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String num = numero.getText();
                int resultado = adivinador.verificar(num);
                if (resultado == 1){
                    descripcion.setText("El numero es menor al ingresado");
                } else if (resultado == 0) {
                    descripcion.setText("CORRECTO, EL NUMERO ES " + adivinador.getNumeroRandom());
                } else if (resultado == -1) {
                    descripcion.setText("El numero es mayor al ingresado");
                }
            }
        });
    }
}
