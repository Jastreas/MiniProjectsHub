import javax.swing.*;

public class Main {

    static MainFrame mf = new MainFrame();

    public static void main(String[] args) {
        Camello c1 = new Camello();
        Camello c2 = new Camello();
        Camello c3 = new Camello();
        c1.start();
        c2.start();
        c3.start();

        boolean run = true;
        while (run) {

            // Cambia la posición en X de camello en base al numero generado en Camello
            mf.pos_x1 += c1.get_randNum();
            mf.actualizarPosicionCamello1(); //no se puede unificar
            mf.pos_x2 += c2.get_randNum();
            mf.actualizarPosicionCamello2();
            mf.pos_x3 += c3.get_randNum();
            mf.actualizarPosicionCamello3();

            //realmente se hace para que no vaya demasiado rápido
            try {
                Thread.sleep(10);  // Espera 10ms antes de moverlo de nuevo
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            // Rompe el bucle cuando el camello llegue a la meta
            if (mf.pos_x1 >= 1050 || mf.pos_x2 >= 1050 || mf.pos_x3 >= 1050) run = false;
        }

        int ganador = mf.comp_ganador();
        String texto = "El camello " + ganador + " es el ganador!";
        mf.mostrarGanador(texto);
    }


}