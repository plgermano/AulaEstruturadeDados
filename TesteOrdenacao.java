import java.util.Date;
import java.util.Scanner;

public class TesteOrdenacao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t;
        NossoVetor v;
        System.out.print("digite o tamanho do vetor, 0 encerra: ");
        t = scanner.nextInt();
        while (t > 0) {
            long ini, fim;
            v = new NossoVetor(t);
            v.preencheVetor();
            // System.out.println("vetor original\n" + v);
            Date d = new Date();
            ini = d.getTime();
            v.bubbleSort();
            fim = new Date().getTime();
            System.out.println("bubble demorou " + (fim - ini) + " milisegundos");
            // System.out.println("vetor ordenado pelo bubble \n" + v);

            v.preencheVetor();
            ini = new Date().getTime();
            v.insertionsort();
            fim = new Date().getTime();
            System.out.println("insertion demorou " + (fim - ini) + " milesegundos");

            ini = new Date().getTime();
            v.bubbleSort();
            fim = new Date().getTime();
            System.out.println("bubble ordenado demorou " + (fim - ini) + " milisegundos");

            ini = new Date().getTime();
            v.insertionsort();
            fim = new Date().getTime();
            System.out.println("insertion ordenado demorou " + (fim - ini) + " milisegundos");

            System.out.print("digite o novo tamanho, 0 encerra: ");
            t = scanner.nextInt();
        }
        scanner.close();
    }

}
