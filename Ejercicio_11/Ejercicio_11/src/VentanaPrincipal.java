import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VentanaPrincipal extends JFrame{
    private JPanel PanelPrincipal;
    private JLabel tituloLabel;
    private JLabel descripcionLabel;
    private JButton botonSiguienteVentana;

    public VentanaPrincipal(){
        super("Administrador de Tareas");

        setContentPane(PanelPrincipal);

        botonSiguienteVentana.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Crea VentanaOpciones
                JFrame opcionesFrame = new VentanaOpciones();
                opcionesFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                opcionesFrame.pack();
                opcionesFrame.setExtendedState(JFrame.MAXIMIZED_BOTH); // Pantalla completa
                opcionesFrame.setVisible(true);

                // Cierra la ventana principal
                JFrame frame = (JFrame) SwingUtilities.getWindowAncestor(botonSiguienteVentana);
                frame.dispose();
            }
        });
    }
}
