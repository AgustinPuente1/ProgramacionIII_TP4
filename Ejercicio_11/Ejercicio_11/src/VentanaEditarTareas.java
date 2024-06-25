import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VentanaEditarTareas extends JFrame{
    private JPanel PanelEditar;
    private JLabel tituloLabel;
    private JTextField nuevoNombreTF;
    private JTextField nuevaDescTF;
    private JButton listoButton;
    private JLabel nombreLabel;
    private JLabel descripcionLabel;
    private JLabel advertencia;

    private int tareaNro;

    public VentanaEditarTareas(int tareaNro){
        super("Editar Tareas");

        setContentPane(PanelEditar);

        listoButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String nuevoNombre = nuevoNombreTF.getText();
                String nuevaDesc = nuevaDescTF.getText();
                if (nuevoNombre.isEmpty()){
                    advertencia.setText("Debe ingresar un nombre");
                    return;
                } else if (nuevaDesc.isEmpty()){
                    advertencia.setText("Debe ingresar una descripcion");
                    return;
                }
                switch (tareaNro){
                    case 1:
                        try {
                            Tareas.modificarTarea(1,nuevoNombre,nuevaDesc);
                        } catch (OutOfCaracteresException ex) {
                            advertencia.setText("Caracteres max: Nombre = 30, Descripcion = 150");
                            return;
                        }
                        break;
                    case 2:
                        try {
                            Tareas.modificarTarea(2,nuevoNombre,nuevaDesc);
                        } catch (OutOfCaracteresException ex) {
                            advertencia.setText("Caracteres max: Nombre = 30, Descripcion = 150");
                            return;
                        }
                        break;
                    case 3:
                        try {
                            Tareas.modificarTarea(3,nuevoNombre,nuevaDesc);
                        } catch (OutOfCaracteresException ex) {
                            advertencia.setText("Caracteres max: Nombre = 30, Descripcion = 150");
                            return;
                        }
                        break;
                    case 4:
                        try {
                            Tareas.modificarTarea(4,nuevoNombre,nuevaDesc);
                        } catch (OutOfCaracteresException ex) {
                            advertencia.setText("Caracteres max: Nombre = 30, Descripcion = 150");
                            return;
                        }
                        break;
                    case 5:
                        try {
                            Tareas.modificarTarea(5,nuevoNombre,nuevaDesc);
                        } catch (OutOfCaracteresException ex) {
                            advertencia.setText("Caracteres max: Nombre = 30, Descripcion = 150");
                            return;
                        }
                        break;
                }
                // Crea VentanaVerTareas
                JFrame verEditarFrame = new VentanaVerTareas();
                verEditarFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                verEditarFrame.pack();
                verEditarFrame.setExtendedState(JFrame.MAXIMIZED_BOTH);
                verEditarFrame.setVisible(true);

                // Cierra la ventana principal
                JFrame frame = (JFrame) SwingUtilities.getWindowAncestor(listoButton);
                frame.dispose();
            }
        });
    }
}
