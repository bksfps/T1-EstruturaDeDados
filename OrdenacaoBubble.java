import java.util.Scanner;
import java.util.Date;
 
public class OrdenacaoBubble {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        MeuVetor v1;
        System.out.print("digite um tamanho para o vetor, 0 encerra: ");
        n = sc.nextInt();
        while (n > 0) {
            v1 = new MeuVetor(n);
            v1.preencheVetor();
            long inicio = new Date().getTime();
            v1.bubbleSort();
            long fim = new Date().getTime();
            System.out.println("tamanho: " + n + ", demorou " + (fim - inicio) + " ms");
 
            System.out.print("digite um tamanho para o vetor, 0 encerra: ");
            n = sc.nextInt();
        }
        sc.close();
    }
}