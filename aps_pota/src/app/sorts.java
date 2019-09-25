package app;

    public class sorts {
    
        public static void main(String[] args) {
            int vetor [] = {3,8,5,4,10,1};
            heapSort(vetor);
                System.out.println(java.util.Arrays.toString(vetor));
        }

        public static void heapSort(int vetor[]) {
            criaHeap(vetor);
    
            int fim = vetor.length - 1;
    
            while (fim > 0) {
                int aux = vetor[0];
                vetor[0] = vetor[fim];
                vetor[fim] = aux;
                fim--;
                arrumaHeap(vetor, 0, fim);
            }
        }
    
        public static void criaHeap(int vetor[]) {
            int inicio = ((vetor.length - 2) / 2);
    
            while (inicio >= 0) {
                arrumaHeap(vetor, inicio, vetor.length - 1);
                inicio--;
            }
        }
    
        public static void arrumaHeap(int vetor[], int inicio, int fim) {
            int raiz = inicio;
    
            while (raiz * 2 + 1 <= fim) {
                int filho = raiz * 2 + 1;
                int trocar = raiz;
    
                if (vetor[trocar] < vetor[filho]) 
                {
                    trocar = filho;
                }
                if (filho + 1 <= fim && vetor[trocar] < vetor[filho + 1]) 
                {
                    trocar = filho + 1;
                }
                if (trocar == raiz) 
                {
                    break;
                } 
                else 
                {
                    swap(vetor, raiz, trocar);
                    raiz = trocar;
                }
            }
        }
    
        public static void swap(int[] vetor, int raiz, int trocar) {
            int aux = vetor[raiz];
            vetor[raiz] = vetor[trocar];
            vetor[trocar] = aux;
    
        }
    }