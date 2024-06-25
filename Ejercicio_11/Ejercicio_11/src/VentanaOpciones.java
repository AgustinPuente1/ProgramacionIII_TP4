import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VentanaOpciones extends  JFrame{
    private JPanel PanelVentanaOpciones;
    private JButton botonVerEditarTareas;
    private JButton botonAgregarTareas;
    private JButton botonBorrarTareas;

    public VentanaOpciones() {
        super("Opciones");

        setContentPane(PanelVentanaOpciones);

        botonVerEditarTareas.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Crea VentanaVerTareas
                JFrame verEditarFrame = new VentanaVerTareas();
                verEditarFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                verEditarFrame.pack();
                verEditarFrame.setExtendedState(JFrame.MAXIMIZED_BOTH);
                verEditarFrame.setVisible(true);

                // Cierra la ventana principal
                JFrame frame = (JFrame) SwingUtilities.getWindowAncestor(botonVerEditarTareas);
                frame.dispose();
            }
        });

        botonAgregarTareas.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Crea VentanaAgregarTareas
                JFrame agregarFrame = new VentanaAgregarTareas();
                agregarFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                agregarFrame.pack();
                agregarFrame.setExtendedState(JFrame.MAXIMIZED_BOTH);
                agregarFrame.setVisible(true);

                // Cierra la ventana principal
                JFrame frame = (JFrame) SwingUtilities.getWindowAncestor(botonVerEditarTareas);
                frame.dispose();
            }
        });

        botonBorrarTareas.addActionListener(new ActionListener() {
           @Override
           public void actionPerformed(ActionEvent e) {
               // Crea VentanaBorrarTareas
               JFrame borrarFrame = new VentanaBorrarTareas();
               borrarFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
               borrarFrame.pack();
               borrarFrame.setExtendedState(JFrame.MAXIMIZED_BOTH);
               borrarFrame.setVisible(true);

               // Cierra la ventana principal
               JFrame frame = (JFrame) SwingUtilities.getWindowAncestor(botonVerEditarTareas);
               frame.dispose();
           }
        });
    }
}
