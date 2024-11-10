import javax.swing.*;
import java.awt.*;

public class MainFrame extends JFrame {

    private JLabel camello1, camello2, camello3, escenario_base, ganador;
    public int pos_x1 = 10;
    public int pos_x2 = 10;
    public int pos_x3 = 10;
    private final int pos_y1 = 75;
    private final int pos_y2 = 275;
    private final int pos_y3 = 475;

    public MainFrame(){
        //cargo assets
        ImageIcon imagen = new ImageIcon("./Assets/camelus.jpg");
        ImageIcon camelloIcon = new ImageIcon("./Assets/camellodelosmalos.png");
        ImageIcon escenario = new ImageIcon("./Assets/escenario.png");

        //cargar musica

        //atributos del frame
        Image ic = imagen.getImage();
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setTitle("Camello");
        this.setIconImage(ic);
        this.setSize(1280,720);
        this.setLayout(null);

        //instancio escenario
        escenario_base = new JLabel(escenario);

        //posición escenario
        escenario_base.setBounds(0,0, escenario.getIconWidth(), escenario.getIconHeight());

        //instancio imagenes de los 3 camellos
        camello1 = new JLabel(camelloIcon);
        camello2 = new JLabel(camelloIcon);
        camello3 = new JLabel(camelloIcon);

        //posicion camellos
        camello1.setBounds(pos_x1, pos_y1, camelloIcon.getIconWidth(), camelloIcon.getIconHeight());
        camello2.setBounds(pos_x2, pos_y2, camelloIcon.getIconWidth(), camelloIcon.getIconHeight());
        camello3.setBounds(pos_x3, pos_y3, camelloIcon.getIconWidth(), camelloIcon.getIconHeight());

        //Render
        this.add(camello1);
        this.add(camello2);
        this.add(camello3);
        this.add(escenario_base);

        //hago visible el frame
        this.setVisible(true);

    }

    // Método para actualizar visualmente la posición de camello1
    public void actualizarPosicionCamello1() {
        camello1.setLocation(pos_x1, pos_y1);  // Mueve el camello1 a la nueva posición
        this.repaint(); //screen.flip  // Refresca la pantalla para mostrar la actualización
    }

    public void actualizarPosicionCamello2() {
        camello2.setLocation(pos_x2, pos_y2);  // Mueve el camello1 a la nueva posición
        this.repaint(); //screen.flip  // Refresca la pantalla para mostrar la actualización
    }

    public void actualizarPosicionCamello3() {
        camello3.setLocation(pos_x3, pos_y3);  // Mueve el camello1 a la nueva posición
        this.repaint(); //screen.flip  // Refresca la pantalla para mostrar la actualización
    }

    //metodo para comprobar el ganador
    public int comp_ganador(){
        int ganador = 0;

        if (pos_x1 >= 1050 && pos_x2 < pos_x1 && pos_x3 < pos_x1){
            ganador = 1;
        } else if (pos_x2 >= 1050 && pos_x2 > pos_x1 && pos_x2 > pos_x3){
            ganador = 2;
        } else {
            ganador = 3;
        }
        return ganador;
    }

    // Método para mostrar el ganador
    public void mostrarGanador(String texto) {
        ganador = new JLabel(texto);
        ganador.setBounds(10, 650, 300, 100); //no consigo cambaiar su posición
        ganador.setForeground(Color.red);
        this.add(ganador);
        this.setComponentZOrder(ganador, 0);
        this.revalidate();
        this.repaint();
    }

}