import java.util.Random;
import java.util.Scanner;

public class OrdenacaoInsertion {
    static Random r = new Random();

    public void geraVetor(int[] v) {
        for (int i = 0; i < v.length; i++) {
            v[i] = r.nextInt(v.length * 10);
        }
    }

    public static void mostrarVetor(int[] v) {
        for (int i = 0; i < v.length; i++) {
            System.out.print(v[i] + " ");
        }
    }

    public void ordernarInsercao(int[] v) {
        for (int i = 1; i < v.length; i++) {
            int index = i;
            while (index > 0 && v[index] < v[index - 1]) {
                int aux = v[index];
                v[index] = v[index - 1];
                v[index - 1] = aux;
                index = index - 1;
            }
        }
    }

    public static void main(String[] args) {
        System.out.println("Digitar valor do vetor: ");
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int[] v = new int[t];
        sc.close();
    }
}
