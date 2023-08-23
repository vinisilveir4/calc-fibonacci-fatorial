import java.util.Locale;
import java.util.Scanner;

public class CalculadoraImc {

    public static void main(String[] args) {

        String msgPeso = "Digite se peso em quilogramas: ";
        String msgAltura = "Digite sua altura em metros: ";

        Scanner ler = new Scanner(System.in).useLocale(Locale.US);

        double peso = getPeso(ler, msgPeso);
        double altura = getAltura(ler, msgAltura);
        ler.close();

        double result = calculoImc(peso, altura);

        if (result < 18.5) {
           mensagem("Tá magro em", result);
        } else if(result >= 18.5 && result < 24.9) {
            mensagem("Peso tá nice", result);
        } else if( result >= 24.9) {
            mensagem("Tá gordinho", result);
        } else {
            mensagem("Vai more", result);
        }

    }
      static double getPeso(Scanner ler, String descricao) {
         System.out.print(descricao);

         double res = validandoresposta(ler.hasNextDouble(), ler, descricao);

         return res;

    }

     static double getAltura(Scanner ler, String descricao) {

        System.out.print(descricao);

        double res = validandoresposta(ler.hasNextDouble(), ler, descricao);

        return res;

    }

     static double validandoresposta(boolean scan, Scanner ler, String descricao) {

        if(scan) return ler.nextDouble();

        boolean validando = true;
        double res = 0;

        do {
            System.out.println("Entrada inválida: " + ler.next());
            System.out.print(descricao);

            if(ler.hasNextDouble()) {

                res = ler.nextDouble();
                validando = false;
            }
        } while(validando);

        return res;

    }

     static double calculoImc(double peso, double altura) {
        return peso / (altura * altura);
    }

     static void mensagem(String msg, double result) {
        System.out.println(String.format("%.2f", result) + ".. " + msg + ".");
    }

}

