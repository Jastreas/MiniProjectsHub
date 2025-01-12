//abrirX son botones hacer rename a botonAbrirX
//change title variable names to tituloX
//El objeto Frame se puede convertir en clase
//El Objeto JLabel se puede convertir en clase
//no entiendo que pasa con los colores de los titulos Jpanel y Jscrollpanel (puede deberse al tipo de borde?)
//linea 221
//mirar las propiedades del dialogo a ver pq funciona
//queda añadir el boton menú en el 1.7
//queda añadir formato a t de VI1 en el 1.7
// ej 1.8
//el formato de la pagina principal

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.border.MatteBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class HomeFrame extends JFrame{


    JButton botonAbrirJframe = new JButton("Ejemplo JFrame");
    JButton botonAbrirJDialog = new JButton("Ejemplo JDialog");
    JButton botonAbrirJPanel = new JButton("Ejemplo JPanel");
    JButton botonAbrirJScrollPanel = new JButton("Ejemplo JScrollPanel");
    JButton botonAbrirJSplitPanel = new JButton("Ejemplo JSplitPanel");
    JButton botonAbrirJTabbedPanel = new JButton("Ejemplo JTabbedPanel");
    JButton botonAbrirJDesktopPanel = new JButton("Ejemplo JDesktopPanel");
    JButton botonAbrirJToolBar = new JButton("Ejemplo JToolBar");
    JButton acercaDe = new JButton("Acerca de...");
    JScrollPane sP;
    String texto;
    JFrame frame;
    JTextArea t;
    JLabel label1;
    Color bgCol = Color.lightGray;
    JSplitPane splitPane;
    JTabbedPane tabbedPane;
    JDesktopPane desktopPane;

    HomeFrame(){

        //Main frame
        label1 = new JLabel("CONTENEDORES JAVA SWING");
        JPanel panel1 = new JPanel();
        JPanel panel2 = new JPanel();

        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setTitle("Ventana Principal");
        this.setSize(550,240);
        this.setLayout(new BorderLayout());
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        this.setVisible(true);

        //panel externo
        panel1.setLayout(new BorderLayout());
        panel1.setBackground(bgCol);
        panel1.setVisible(true);

        label1.setHorizontalAlignment(JLabel.CENTER);
        label1.setFont(new Font("Arial", Font.BOLD, 24));
        label1.setBorder(new EmptyBorder(20,0,0,0));

        //panel interno
        panel2.setLayout(new FlowLayout());
        panel2.setBackground(bgCol);
        panel2.setBorder(BorderFactory.createEmptyBorder(5,30,20,20));
        panel2.setVisible(true);

        panel2.add(botonAbrirJframe);
        panel2.add(botonAbrirJDialog);
        panel2.add(botonAbrirJPanel);
        panel2.add(botonAbrirJScrollPanel);
        panel2.add(botonAbrirJSplitPanel);
        panel2.add(botonAbrirJTabbedPanel);
        panel2.add(botonAbrirJDesktopPanel);
        panel2.add(botonAbrirJToolBar);
        panel1.add(label1, BorderLayout.NORTH);
        panel1.add(panel2, BorderLayout.CENTER);

        this.add(acercaDe, BorderLayout.NORTH);
        this.add(panel1, BorderLayout.CENTER);

        //funcionalidad a los botones

        botonAbrirJframe.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                VentanaJFrame b1Frame = new VentanaJFrame();
            }
        });

        botonAbrirJDialog.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                Color abrirJDialogBGColor = Color.lightGray; //cambiar de nombre esta variable
                JDialog dialog = new JDialog(HomeFrame.this);

                //texto del dialogo
                String jDialogMsg = "Esta ventana es un JDialog, es usada como ventana de confirmación " + "o como su nombre lo dice, ventana de dialogo, " +
                        "tiene una propiedad que le permite ser hija de un JFrame u otro JDialog" +
                        ", de esta manera inhabilitamos la ventana padre hasta que la ventana hija " +
                        "sea cerrada (intenta dar click sobre alguno de los botones de la ventana principal)";
                JLabel l1 = new JLabel("CONTENEDOR JDIALOG"); //título
                JTextArea textArea = new JTextArea(jDialogMsg); //texto

                //Propiedades dialogo
                dialog.setTitle("Actividad 1.2: Ventana JDialog");
                dialog.setSize(new Dimension(450,255));
                dialog.setResizable(false);
                dialog.setLayout(new BorderLayout());
                dialog.setLocationRelativeTo(null);
                dialog.getContentPane().setBackground(abrirJDialogBGColor);
                dialog.setModalityType(JDialog.DEFAULT_MODALITY_TYPE);

                //Propiedades titulo
                l1.setBackground(abrirJDialogBGColor);
                l1.setForeground(Color.black);
                l1.setHorizontalAlignment(JLabel.CENTER);
                l1.setFont(new Font("Arial", Font.BOLD,24));
                l1.setBorder(BorderFactory.createEmptyBorder(30,0,0,0));

                //Propiedades textarea
                textArea.setEditable(false);
                textArea.setLineWrap(true);
                textArea.setWrapStyleWord(true);
                textArea.setBackground(Color.white);
                textArea.setBorder(new MatteBorder(15, 25, 15, 25, abrirJDialogBGColor));

                dialog.add(l1, BorderLayout.NORTH);
                dialog.add(textArea, BorderLayout.CENTER);
                dialog.setVisible(true);

            }
        });

        botonAbrirJPanel.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                VentanaJPanel jPanel = new VentanaJPanel();
            }
        });

        botonAbrirJScrollPanel.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                label1 = new JLabel("CONTENEDOR JSCROLLPANE");
                texto = "Este contenedor permite mostrar las barras de scroll en nuestra Ventana o Seleccion de la ventana" +
                        " (si lo adicionamos a un panel) De esta forma podemos crear gran cantidad de componentes sin necesidad de tener" +
                        "una ventana muy grande. \n\n Los scroll se muestran dependiendo del tamaño de la ventanaroll.";

                frame = new JFrame("Actividad 1.4: JScrollPane");
                t = new JTextArea(texto);

                //He añadido alineamiento automático en el texto ya que en la imagen se vé así
                frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                frame.setSize(640,480);
                frame.setLayout(new BorderLayout());
                frame.setVisible(true);
                frame.setResizable(false);
                frame.setBackground(bgCol);

                label1.setForeground(Color.black);
                label1.setHorizontalAlignment(JLabel.CENTER);
                label1.setFont(new Font("Arial", Font.BOLD,24));
                label1.setBorder(BorderFactory.createEmptyBorder(30,0,0,0));
                label1.setBackground(bgCol);

                t.setFont(new Font("Arial", Font.PLAIN, 20));
                t.setLineWrap(true);
                t.setWrapStyleWord(true);
                t.setEditable(false);
                t.setBorder(BorderFactory.createMatteBorder(20,40,0,0,bgCol));

                sP = new JScrollPane();
                sP.setBackground(bgCol);
                sP.setViewportView(t);
                sP.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
                sP.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);

                frame.add(label1, BorderLayout.NORTH);
                frame.add(sP, BorderLayout.CENTER);
            }
        });

        botonAbrirJSplitPanel.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                splitPane = new JSplitPane();
                texto = "Este contenedor presenta una ventana con pestañas en su" +
                        "barra de tareas, cada pestaña presenta un panel diferente donde" +
                        "se pueden almacenar otros componentes Java Swing";
                label1 = new JLabel("CONTENEDOR JSPLITPANE");
                t = new JTextArea(texto);

                frame = new JFrame("Actividad 1.5 JSplitPane");
                frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                frame.setMinimumSize(new Dimension(640,360));
                frame.setSize(640,360);
                frame.setBackground(bgCol);
                frame.setLayout(new BorderLayout());
                frame.setVisible(true);

                //label no responsivo para ahorrar tiempo
                label1.setBackground(bgCol);
                label1.setForeground(Color.black);
                label1.setHorizontalAlignment(JLabel.CENTER);
                label1.setFont(new Font("Arial", Font.BOLD,15));

                t.setFont(new Font("Arial", Font.PLAIN, 20));
                t.setLineWrap(true);
                t.setWrapStyleWord(true);
                t.setEditable(false);

                splitPane.setLayout(new BorderLayout());
                splitPane.add(label1, BorderLayout.CENTER);

                frame.add(t);
                frame.add(splitPane, BorderLayout.WEST);

            }
        });


        //no se qué le pasa al boton de la pestaña 3 da igual que layout use, o que metodos ponga no cambia de tamaño

        botonAbrirJTabbedPanel.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame = new JFrame("Actividad 1.6: JTabbedPane");
                JPanel panel1 = new JPanel();
                JPanel panel2 = new JPanel();
                JPanel panel3 = new JPanel();
                JLabel label2 = new JLabel("Titulo Panel1");
                JLabel label3 = new JLabel("Titulo Panel2");
                JButton botonAux = new JButton("Botón");
                tabbedPane = new JTabbedPane();
                texto = "Este contenedor presenta una ventana con pestañas en su barra de tareas" +
                        ", cada pestaña presenta un panel diferente donde se pueden almacenar otros" +
                        "componentes Java Swing";
                t = new JTextArea(texto);
                label1 = new JLabel("CONTENEDOR JTABBEDPANE");

                frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                frame.setMinimumSize(new Dimension(640,360));
                frame.setSize(640,480);
                frame.setBackground(bgCol);
                frame.setLayout(new BorderLayout());
                frame.setVisible(true);

                panel1.setLayout(new BorderLayout());
                panel1.setBackground(bgCol);

                label1.setBackground(bgCol);
                label1.setForeground(Color.black);
                label1.setHorizontalAlignment(JLabel.CENTER);
                label1.setFont(new Font("Arial", Font.BOLD,30));
                label1.setBorder(BorderFactory.createMatteBorder(20,0,0,0,bgCol));

                t.setFont(new Font("Arial", Font.PLAIN, 10));
                t.setLineWrap(true);
                t.setWrapStyleWord(true);
                t.setEditable(false);
                t.setBorder(BorderFactory.createMatteBorder(10,20,40,20,bgCol));

                panel2.setLayout(new BorderLayout());
                panel2.setBackground(Color.red);

                label2.setBackground(Color.RED);
                label2.setForeground(Color.black);
                label2.setHorizontalAlignment(JLabel.CENTER);
                label2.setFont(new Font("Arial", Font.BOLD,15));

                panel3.setLayout(new BorderLayout());
                panel3.setBackground(Color.GREEN);

                label3.setBackground(Color.GREEN);
                label3.setForeground(Color.black);
                label3.setBorder(BorderFactory.createMatteBorder(20,40,0,0, Color.GREEN));

                botonAux.setBorder(BorderFactory.createMatteBorder(50,20,70,200, Color.GREEN));

                label1.setFont(new Font("Arial", Font.BOLD,15));

                panel1.add(label1, BorderLayout.NORTH);
                panel1.add(t, BorderLayout.CENTER);

                panel2.add(label2, BorderLayout.NORTH);

                panel3.add(label3, BorderLayout.NORTH);
                panel3.add(botonAux, BorderLayout.CENTER);

                tabbedPane.addTab("Pestaña 1", panel1);
                tabbedPane.addTab("Pestaña 2", panel2);
                tabbedPane.addTab("Pestaña 3", panel3);

                frame.add(tabbedPane, BorderLayout.CENTER);

            }
        });

        botonAbrirJDesktopPanel.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame = new JFrame("Actividad 1.7: JDesktopPane");
                desktopPane = new JDesktopPane();
                texto = "Este contenedor presenta una ventana principal junto ocn otras" +
                        "ventanas internas, cada ventana será independiente y " +
                        "permite cambiar su posición y tamaño (dependiendo de las propiedades" +
                        "asignadas)";
                t = new JTextArea(texto);
                JInternalFrame internalFrame2 = new JInternalFrame("Ventana Interna 2");
                JInternalFrame internalFrame = new JInternalFrame("Ventana Interna 1");
                label1 = new JLabel("Titulo Panel1");
                JLabel label2 = new JLabel("CONTENEDOR JDESKTOPPANE");

                //main frame
                frame.setContentPane(desktopPane);
                frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                frame.setSize(800,600);
                frame.setMinimumSize(new Dimension(640,360));
                frame.setBackground(bgCol);
                frame.setVisible(true);

                desktopPane.setSize(800,600);

                //internal frame superior
                internalFrame2.setLocation(1, 400);
                internalFrame2.setLayout(new BorderLayout());
                internalFrame2.setBackground(Color.CYAN);
                internalFrame2.setSize(200, 100);
                internalFrame2.setClosable(true);
                internalFrame2.setResizable(false);
                internalFrame2.setVisible(true);

                label1.setHorizontalAlignment(JLabel.CENTER);
                label1.setFont(new Font("Arial", Font.BOLD,15));

                //internal frame inferior
                internalFrame.setLocation(0, 0);
                internalFrame.setLayout(new BorderLayout());
                internalFrame.setSize(455, 240);
                internalFrame.setClosable(false);
                internalFrame.setResizable(true);
                internalFrame.setVisible(true);

                label2.setHorizontalAlignment(JLabel.CENTER);
                label2.setFont(new Font("Arial", Font.BOLD,15));

                t.setFont(new Font("Arial", Font.PLAIN, 10));
                t.setLineWrap(true);
                t.setWrapStyleWord(true);
                t.setEditable(false);
                t.setBorder(BorderFactory.createEmptyBorder(30,0,0,0));


                internalFrame.add(label2, BorderLayout.NORTH);
                internalFrame.add(t, BorderLayout.CENTER);
                internalFrame2.add(label1, BorderLayout.NORTH);
                desktopPane.add(internalFrame2);
                desktopPane.add(internalFrame);
                desktopPane.repaint();

            }
        });

        botonAbrirJToolBar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //Dar Formato al Label

                JFrame frame;
                JButton b1, b2, b3;
                JLabel label;
                JTextArea t;
                String mensaje;
                JToolBar toolBar;
                Color bgCol = Color.lightGray;

                frame = new JFrame("Actividad 1.8: JToolBar");
                toolBar = new JToolBar();
                b1 = new JButton("boton1");
                b2 = new JButton("boton2");
                b3 = new JButton("boton3");
                label = new JLabel("CONTENEDOR JTOOLBAR");
                mensaje = "Este contenedor representa una barra de herramientas donde" +
                        "podemos alojar diferentes componentes Java Swing, la barra puede ser" +
                        "arrastrada a cualquier posicion de los extremos o se puede sacar como ventana independiente.";
                t = new JTextArea(mensaje);
                JPanel panel = new JPanel();

                frame.setMinimumSize(new Dimension(640,360));
                frame.setSize(640,480);
                frame.setLayout(new BorderLayout());
                frame.setVisible(true);
                frame.setLocationRelativeTo(null);

                panel.setLayout(new BorderLayout());

                label.setBackground(bgCol);
                label.setForeground(Color.black);
                label.setHorizontalAlignment(JLabel.CENTER);
                label.setBorder(new EmptyBorder(20,0,0,0));

                t.setLineWrap(true);
                t.setWrapStyleWord(true);
                t.setBorder(BorderFactory.createMatteBorder(10,40,60,20, bgCol));

                panel.add(label, BorderLayout.NORTH);
                panel.add(t, BorderLayout.CENTER);


                toolBar.add(b1);
                toolBar.add(b2);
                toolBar.add(b3);
                frame.add(toolBar, BorderLayout.NORTH);
                frame.add(panel, BorderLayout.CENTER);
            }
        });

        acercaDe.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "Esta es una aplicaicon simple" +
                        " con el fin de exponer de forma sencilla los diferentes contenedores Java Swing.", "Acerca de...", JOptionPane.INFORMATION_MESSAGE);
            }
        });



    }

}