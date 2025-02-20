import javax.swing.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                JFrame principalFrame = new VentanaPrincipal();
                principalFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                principalFrame.pack();
                principalFrame.setExtendedState(JFrame.MAXIMIZED_BOTH);
                principalFrame.setVisible(true);
            }
        });
    }
}