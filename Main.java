package alugueldepatins;

public class Main {

    public static void main(String[] args) {
        try {
            javax.swing.UIManager.setLookAndFeel(
            javax.swing.UIManager.getSystemLookAndFeelClassName());
        } catch (Exception e) {
        }
        
        JanelaPrincipal janelaPrincipal = new JanelaPrincipal();
        janelaPrincipal.setLocationRelativeTo(null);
        janelaPrincipal.setVisible(true);
    }
    
}
