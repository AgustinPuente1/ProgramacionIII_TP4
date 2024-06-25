import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VentanaAgregarTareas extends JFrame{
    private JPanel PanelAgregarTareas;
    private JLabel tituloLabel;
    private JTextField nombreTextField;
    private JLabel nombreLabel;
    private JLabel descripcionLabel;
    private JButton listoButton;
    private JTextField descripcionTextField;
    private JLabel advertencia;
    private JButton volverButton;

    public VentanaAgregarTareas(){
        super("Agregar Tareas");

        setContentPane(PanelAgregarTareas);

        listoButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String nuevoNombre = nombreTextField.getText();
                String nuevaDesc = descripcionTextField.getText();
                if (nuevoNombre.isEmpty()){
                    advertencia.setText("Debe ingresar un nombre");
                    return;
                } else if (nuevaDesc.isEmpty()){
                    advertencia.setText("Debe ingresar una descripcion");
                    return;
                }

                try {
                    Tareas.agregarTarea(nuevoNombre, nuevaDesc);
                    advertencia.setText("Tarea agregado correctamente");
                    return;
                } catch (OutOfCaracteresException ex) {
                    advertencia.setText("Caracteres max: Nombre = 30, Descripcion = 150");
                    return;
                } catch (ListaLlenaException ex) {
                    advertencia.setText("Lista llena, no se pueden agregar más tareas. Puede volver al inicio");
                    return;
                }

            }
        });

        volverButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Crea VentanaOpciones
                JFrame opcionesFrame = new VentanaOpciones();
                opcionesFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                opcionesFrame.pack();
                opcionesFrame.setExtendedState(JFrame.MAXIMIZED_BOTH);
                opcionesFrame.setVisible(true);

                // Cierra la ventana principal
                JFrame frame = (JFrame) SwingUtilities.getWindowAncestor(volverButton);
                frame.dispose();
            }
        });
    }
}
