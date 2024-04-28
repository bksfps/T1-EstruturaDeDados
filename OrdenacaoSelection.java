import java.util.Random;
import java.util.Scanner;

public class OrdenacaoSelection {
    static Random r = new Random();

    public static void geraVetor(int[] v) {
        for (int i = 0; i < v.length; i++) {
            v[i] = r.nextInt(v.length * 10);
        }
    }

    public static void mostrarVetor(int[] v) {
        for (int i = 0; i < v.length; i++) {
            System.out.print(v[i] + " ");
        }
    }
    public static void ordernarSelecao(int []v){
        int index =0;
        for (int i = 0; i < v.length; i++) {
            index = i;
            for(int j=i+1;j<v.length;j++){   
                if(v[j] < v[index]){
                    index= j;
                }

            }
         int menor_elemento = v[index];
         v[index] = v[i];
         v[i] = menor_elemento;
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o tamanho do vetor: ");
        int vetor = sc.nextInt();
        int []v = new int[vetor];
        geraVetor(v);
        mostrarVetor(v);
        ordernarSelecao(v);
        System.out.println("\n");
        mostrarVetor(v);
    }
}
