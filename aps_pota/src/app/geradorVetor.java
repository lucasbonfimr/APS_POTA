package app;

import java.util.ArrayList;

public class geradorVetor {

        public static void main(String[] args) {
            
            geradorVetor(100);

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