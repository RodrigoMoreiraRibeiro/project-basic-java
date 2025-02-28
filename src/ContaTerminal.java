import java.util.Scanner;
import java.util.Locale;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.getDefault());

        System.out.println("Digite o numero da conta: ");
        int num = scanner.nextInt();

        System.out.println("Agencia: ");
        String agencia = scanner.next();

        System.out.println("Nome: ");
        String nome = scanner.next();

        System.out.println("Saldo: ");
        double saldo = scanner.nextDouble();


        // Informacoes:

        System.out.println("Ola ".concat(nome));
        System.out.println("Obrigado por criar sua conta em nosso banco! ");
        System.out.println("Sua agencia e: ".concat(agencia));
        System.out.println("Conta: " + num);
        System.out.println("Com o saldo: " + saldo);

        scanner.close();






    }
}
