//CLASE DEDICADA A GESTIONAR LAS MECÁNICAS DE CAMELLOS

import java.util.concurrent.ThreadLocalRandom;

public class Camello extends Thread {

    int randNum = 0;

    @Override
    public void run() {
        try {
            gen_randNum();
            Thread.sleep(1000);
        } catch (InterruptedException e) { e.printStackTrace(); }
    }

    public int get_randNum(){ return randNum; }

    public void gen_randNum(){
        randNum = ThreadLocalRandom.current().nextInt(0, 3 + 1);
    }

}
