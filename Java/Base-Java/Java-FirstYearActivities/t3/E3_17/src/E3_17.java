public class E3_17 {
    public static void main(String[] args) throws Exception {
        final int edad_min_mañana = 16, edad_max_mañana = 28, edad_min_tarde = 16, edad_max_tarde = 35,
                edad_min_noche = 18, edad_max_noche = 45, alumnos_mañana = 50, alumnos_tarde = 60, alumnos_noche = 110;
        int promedio = 0, contador = 0, rand_ant = 0;

        while (contador < alumnos_mañana) {
            int rand_act = (int) (Math.random() * ((edad_max_mañana - edad_min_mañana + 1) + edad_min_mañana));
            promedio = rand_ant + rand_act;
            rand_ant = rand_act;
            contador++;
        }

        System.out.println("Mañana" +
                "Edad mínima: " + edad_min_mañana + " Edad máxima: " + edad_max_mañana + " Promedio: " + promedio);

        while (contador < alumnos_tarde) {
            int rand_act = (int) (Math.random() * ((edad_max_tarde - edad_min_tarde + 1) + edad_min_tarde));
            promedio = rand_ant + rand_act;
            rand_ant = rand_act;
            contador++;
        }

        System.out.println("Tarde" +
                "Edad mínima: " + edad_min_tarde + " Edad máxima: " + edad_max_tarde + " Promedio: " + promedio);

        while (contador < alumnos_noche) {
            int rand_act = (int) (Math.random() * ((edad_max_noche - edad_min_noche + 1) + edad_min_noche));
            promedio = rand_ant + rand_act;
            rand_ant = rand_act;
            contador++;
        }

        System.out.println("Noche" +
                "Edad mínima: " + edad_min_noche + " Edad máxima: " + edad_max_noche + " Promedio: " + promedio);

    }
}
