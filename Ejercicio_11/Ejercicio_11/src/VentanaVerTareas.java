import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VentanaVerTareas extends JFrame{
    private JPanel PanelVerTareas;
    private JLabel tituloLabel;
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
    private JLabel tarea1Desc;
    private JLabel tarea2Desc;
    private JLabel tarea3Desc;
    private JLabel tarea4Desc;
    private JLabel tarea5Desc;
    private JButton volverButton;
    private JButton editarT1Button;
    private JButton editarT2Button;
    private JButton editarT3Button;
    private JButton editarT4Button;
    private JButton editarT5Button;
    private JLabel nombreTLabel;
    private JLabel descripcionTLabel;

    public VentanaVerTareas(){
        super("Ver Tareas");

        setContentPane(PanelVerTareas);

        tarea1Nombre.setText(Tareas.getNombreT1());
        tarea2Nombre.setText(Tareas.getNombreT2());
        tarea3Nombre.setText(Tareas.getNombreT3());
        tarea4Nombre.setText(Tareas.getNombreT4());
        tarea5Nombre.setText(Tareas.getNombreT5());
        tarea1Desc.setText(Tareas.getDescripcionT1());
        tarea2Desc.setText(Tareas.getDescripcionT2());
        tarea3Desc.setText(Tareas.getDescripcionT3());
        tarea4Desc.setText(Tareas.getDescripcionT4());
        tarea5Desc.setText(Tareas.getDescripcionT5());

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

        editarT1Button.addActionListener(new ActionListener() {
           @Override
           public void actionPerformed(ActionEvent e) {
               JFrame editarFrame = new VentanaEditarTareas(1);
               editarFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
               editarFrame.pack();
               editarFrame.setExtendedState(JFrame.MAXIMIZED_BOTH);
               editarFrame.setVisible(true);

               // Cierra la ventana principal
               JFrame frame = (JFrame) SwingUtilities.getWindowAncestor(volverButton);
               frame.dispose();
           }
        });

        editarT2Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFrame editarFrame = new VentanaEditarTareas(2);
                editarFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                editarFrame.pack();
                editarFrame.setExtendedState(JFrame.MAXIMIZED_BOTH);
                editarFrame.setVisible(true);

                // Cierra la ventana principal
                JFrame frame = (JFrame) SwingUtilities.getWindowAncestor(volverButton);
                frame.dispose();
            }
        });

        editarT3Button.addActionListener(new ActionListener() {
           @Override
           public void actionPerformed(ActionEvent e) {
               JFrame editarFrame = new VentanaEditarTareas(3);
               editarFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
               editarFrame.pack();
               editarFrame.setExtendedState(JFrame.MAXIMIZED_BOTH);
               editarFrame.setVisible(true);

               // Cierra la ventana principal
               JFrame frame = (JFrame) SwingUtilities.getWindowAncestor(volverButton);
               frame.dispose();
           }
        });

        editarT4Button.addActionListener(new ActionListener() {
           @Override
           public void actionPerformed(ActionEvent e) {
               JFrame editarFrame = new VentanaEditarTareas(4);
               editarFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
               editarFrame.pack();
               editarFrame.setExtendedState(JFrame.MAXIMIZED_BOTH);
               editarFrame.setVisible(true);

               // Cierra la ventana principal
               JFrame frame = (JFrame) SwingUtilities.getWindowAncestor(volverButton);
               frame.dispose();
           }
        });

        editarT5Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFrame editarFrame = new VentanaEditarTareas(5);
                editarFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                editarFrame.pack();
                editarFrame.setExtendedState(JFrame.MAXIMIZED_BOTH);
                editarFrame.setVisible(true);

                // Cierra la ventana principal
                JFrame frame = (JFrame) SwingUtilities.getWindowAncestor(volverButton);
                frame.dispose();
            }
        });
    }
}
