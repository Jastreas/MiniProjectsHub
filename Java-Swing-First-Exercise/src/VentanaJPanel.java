//falta el último toque de color que da igual como lo haga no lo consigo

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VentanaJPanel extends JFrame {

    JLabel tituloJPanel = new JLabel("CONTENEDOR JPANEL");
    JLabel tituloP1 = new JLabel("Titulo Panel1");
    JLabel tituloP2 = new JLabel("Titulo Panel2");
    JPanel a1p3FrameCentro = new JPanel(null); //contenedor de los 2 paneles
    JPanel a1p3FrameSouth = new JPanel(null); //contenedor de los 2 botones
    JPanel p1 = new JPanel(null);
    JPanel p2 = new JPanel(null);
    JButton p2Boton = new JButton("Boton");
    JButton mostrarP2 = new JButton("Mostrar Panel2");
    JButton ocultarP2 = new JButton("Ocultar Panel2");

    VentanaJPanel(){
        Color a1p3FrameBG = Color.lightGray;

        //parametros frame
        this.setTitle("Actividad 1.3: Ventana JPanel");
        this.setMinimumSize(new Dimension(450,255));
        this.setSize(640,480);
        this.setResizable(false);
        this.setLayout(new BorderLayout());
        this.setLocationRelativeTo(null);
        this.setBackground(a1p3FrameBG);
        this.setVisible(true);


        tituloJPanel.setForeground(Color.BLACK);
        tituloJPanel.setHorizontalAlignment(JLabel.CENTER);
        tituloJPanel.setBackground(a1p3FrameBG);
        tituloJPanel.setFont(new Font("Arial", Font.BOLD,24));
        tituloJPanel.setBorder(BorderFactory.createMatteBorder(30,0,10,0, a1p3FrameBG));

        tituloP1.setForeground(Color.BLACK);
        tituloP1.setHorizontalAlignment(JLabel.CENTER);
        tituloP1.setFont(new Font("Arial", Font.BOLD,16));

        tituloP2.setForeground(Color.BLACK);
        tituloP2.setHorizontalAlignment(JLabel.CENTER);
        tituloP2.setFont(new Font("Arial", Font.BOLD,16));
        tituloP2.setBorder(BorderFactory.createEmptyBorder(30,0,0,0));


        p1.setSize(200,200);
        p1.setLayout(new BorderLayout());
        p1.add(tituloP1, BorderLayout.NORTH);
        p1.setBackground(Color.red);
        p1.setBorder(BorderFactory.createMatteBorder(0,45,60,0, a1p3FrameBG));


        p2Boton.setBorder(BorderFactory.createMatteBorder(70,60,70,60, Color.GREEN));

        p2.setSize(200,200);
        p2.setLayout(new BorderLayout());
        p2.add(tituloP2, BorderLayout.NORTH);
        p2.add(p2Boton, BorderLayout.CENTER);
        p2.setBackground(Color.GREEN);
        p2.setBorder(BorderFactory.createMatteBorder(0,0,60,45, a1p3FrameBG));

        a1p3FrameCentro.setLayout(new GridLayout(1,2,30,0));
        a1p3FrameCentro.setBackground(a1p3FrameBG);
        a1p3FrameCentro.add(p1);
        a1p3FrameCentro.add(p2);

        a1p3FrameSouth.setLayout(new GridLayout(2,1,0,10));
        a1p3FrameSouth.setBackground(a1p3FrameBG);
        a1p3FrameSouth.add(mostrarP2);
        a1p3FrameSouth.add(ocultarP2);
        a1p3FrameSouth.setBorder(BorderFactory.createMatteBorder(0,35,15,420, a1p3FrameBG));

        mostrarP2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                p2.setVisible(true);
            }
        });

        ocultarP2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                p2.setVisible(false);
            }
        });


        this.add(tituloJPanel, BorderLayout.NORTH);
        this.add(a1p3FrameCentro, BorderLayout.CENTER);
        this.add(a1p3FrameSouth, BorderLayout.SOUTH);

    }

}
