import javax.swing.*;
import java.awt.*;

public class VentanaJFrame extends JFrame {

    JLabel label1 = new JLabel("CONTENEDOR JFRAME");
    JTextArea textArea;
    JPanel panel = new JPanel();

    VentanaJFrame(){

        Color colorBG = Color.lightGray;

        this.setTitle("Actividad 1.1: Ventana JFrame");
        this.getContentPane().setBackground(colorBG);
        this.setResizable(true);
        this.setMinimumSize(new Dimension(450,255));
        this.setSize(640,360);
        this.setLayout(new BorderLayout());
        this.setLocationRelativeTo(null);

        label1.setBackground(colorBG);
        label1.setForeground(Color.black);
        label1.setHorizontalAlignment(JLabel.CENTER);
        label1.setFont(new Font("Arial", Font.BOLD,24));
        label1.setBorder(BorderFactory.createEmptyBorder(30,0,0,0));

        String text = "Esta ventana y la Ventana principal son un ejemplo de contenedores JFrame, son ideales para ventanas principales y permiten almacenar cualquier tipo de componente.";
        textArea = new JTextArea(text, 3,10);
        textArea.setFont(new Font("Arial", Font.PLAIN, 12));
        textArea.setLineWrap(true);
        textArea.setWrapStyleWord(true);
        textArea.setEditable(false);
        textArea.setBackground(Color.white);

        panel.setLayout(new BorderLayout());
        panel.add(textArea, BorderLayout.CENTER);
        panel.setBorder(BorderFactory.createMatteBorder(15, 25, 15, 25, colorBG));

        this.add(label1, BorderLayout.NORTH);
        this.add(panel, BorderLayout.CENTER);

        this.setVisible(true);

    }

}
