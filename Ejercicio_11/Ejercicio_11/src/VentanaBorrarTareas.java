import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VentanaBorrarTareas extends JFrame {
    private JPanel PanelBorrarTareas;
    private JLabel tituloLabel;
    private JButton volverButton;
    private JButton borrarButton1;
    private JButton borrarButton2;
    private JButton borrarButton3;
    private JButton borrarButton4;
    private JButton borrarButton5;
    private JLabel tarea1Label;
    private JLabel tarea2Label;
    private JLabel tarea3Label;
    private JLabel tarea4Label;
    private JLabel tarea5Label;
    private JLabel tarea1Nombre;
    private JLabel tarea2Nombre;
    private JLabel tarea3Nombre;
    private JLabel tarea4Nombre;
    private JLabel tarea5Nombre;

    public VentanaBorrarTareas() {
        super("Borrar Tareas");

        setContentPane(PanelBorrarTareas);

        tarea1Nombre.setText(Tareas.getDescripcionT1());
        tarea2Nombre.setText(Tareas.getDescripcionT2());
        tarea3Nombre.setText(Tareas.getDescripcionT3());
        tarea4Nombre.setText(Tareas.getDescripcionT4());
        tarea5Nombre.setText(Tareas.getDescripcionT5());

        volverButton.addActionListener(new ActionListener() {
           @Override
           public void actionPerformed(ActionEvent e) {
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

        borrarButton1.addActionListener(new ActionListener() {
           @Override
           public void actionPerformed(ActionEvent e) {
                Tareas.borrarTarea(1);
                tarea1Nombre.setText(Tareas.getNombreT1());
           }
        });

        borrarButton2.addActionListener(new ActionListener() {
           @Override
           public void actionPerformed(ActionEvent e) {
                Tareas.borrarTarea(2);
                tarea2Nombre.setText(Tareas.getNombreT2());
           }
        });

        borrarButton3.addActionListener(new ActionListener() {
           @Override
           public void actionPerformed(ActionEvent e) {
                Tareas.borrarTarea(3);
                tarea3Nombre.setText(Tareas.getNombreT3());
           }
        });

        borrarButton4.addActionListener(new ActionListener() {
           @Override
           public void actionPerformed(ActionEvent e) {
                Tareas.borrarTarea(4);
                tarea4Nombre.setText(Tareas.getNombreT4());
           }
        });

        borrarButton5.addActionListener(new ActionListener() {
           @Override
           public void actionPerformed(ActionEvent e) {
                Tareas.borrarTarea(5);
                tarea5Nombre.setText(Tareas.getNombreT5());
           }
        });
    }
}
