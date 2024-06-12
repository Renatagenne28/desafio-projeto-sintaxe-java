import java.util.Locale;
import java.util.Scanner;

public class contaTerminal {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        
        System.out.println("Digite seu Nome");
        String nome = scanner.next();

        System.out.println("Digite o número da sua agência");
        String agencia = scanner.next();

        System.out.println("Digite o número da sua conta ");
        int conta = scanner.nextInt();

        System.out.println("Digite o número da seu saldo ");
        double saldo = scanner.nextDouble();

        
        System.out.println("Ola " + nome +", obrigado por criar uma conta em nosso banco, sua Agência é ");
        System.out.println( agencia + ", Conta");
        System.out.println( conta + "e seu saldo");
        System.out.println( saldo + " já está disponível.");
        
}
}



