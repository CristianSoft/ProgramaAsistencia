import javax.swing.*;

public class VentanaPrincipal extends JDialog {
    private JPanel contentPane;
    private JButton buttonOK;
    private JButton buttonCancel;

    public VentanaPrincipal() {
        setContentPane(contentPane);
        setModal(true);
        getRootPane().setDefaultButton(buttonOK);
    }

    public static void main(String[] args) {
        VentanaPrincipal dialog = new VentanaPrincipal();
        dialog.pack();
        dialog.setVisible(true);
        System.exit(0);
    }
}
