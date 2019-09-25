package app;

import java.util.ArrayList;

public class geradorVetor {

        public static void main(String[] args) throws Exception {
            // geradorVetor(5);
            // geradorVetor(10);
            // geradorVetor(50);
            // geradorVetor(100);
            // geradorVetor(1000);
            geradorVetor(10000);
        }

        public static void geradorVetor(int valor) {

            ArrayList<Integer> lista = new ArrayList<Integer>();

            while (lista.size() < valor) {
                Integer numeroRandomico = (int) (1 + (Math.random() * valor));
                if (!lista.contains(numeroRandomico)) {
                    lista.add(numeroRandomico);
                }
            }
            System.out.println(lista);
        }
}