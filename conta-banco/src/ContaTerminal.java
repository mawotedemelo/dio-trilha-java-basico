
import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    /**
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        String nomeDoCliente;
        String sobrenome;
        int numeroDaConta;
        String agencia;
        double saldo;

        System.out.println("Por favor, insira os dados que lhe forem solicitados a seguir:");
        System.out.println("--------------------------------------------------------------");
        System.out.println();

        System.out.println("Digite seu nome: ");
        nomeDoCliente = scanner.next();

        System.out.println("Digite seu sobrenome: ");
        sobrenome = scanner.next();

        System.out.println("Digite seu numero de conta: ");
        numeroDaConta = scanner.nextInt();

        System.out.println("Digite a agencia: ");
        agencia = scanner.next();

        System.out.println("Digite o saldo: ");
        saldo = scanner.nextDouble();

        scanner.close();

        System.out.println();
        System.out.println("Olá "+ nomeDoCliente + " "+ sobrenome +", obrigado por criar uma conta em nosso banco, sua agência é: "+ agencia + " conta número " + numeroDaConta + " e seu saldo " + saldo + " já está disponível para saque.");
    }
}
