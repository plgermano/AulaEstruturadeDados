public class Soma {
    public static void main(String[] args) {
        int soma = 0;
        for (int i = 0; i < args.length; i++) {
            // System.out.println(args[i]);
            soma += Integer.parseInt(args[i]);
        }
        System.out.println("\n" + soma);
    }
}
