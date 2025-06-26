import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        double x = 10.35784;

        System.out.println(x);
        // Saída formatada
        System.out.printf("%.2f%n", x);
        System.out.printf("%.4f%n", x);
        // Saída formatada com ponto
        Locale.setDefault(Locale.US);
        System.out.printf("%.4f%n", x);
        // Concatenação
        System.out.println("RESULTADO = " + x + " METROS");
        // Concatenação utilizando printf
        System.out.printf("RESULTADO = %.2f METROS%n", x);

        String name = "Maria";
        int age = 31;
        double income = 4000.0;
        System.out.printf("%s tem %d e ganha R$ %.2f reais%n", name, age, income);
    }
}