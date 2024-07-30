import java.util.Scanner;

public class ContaTerminal {
    String nome;
    String agencia;
    int conta;
    double saldo;

    public static void main(String[] args) {
        ContaTerminal conta = new ContaTerminal();
        conta.lerDados();
        conta.exibirMensagem();
    }

    public void lerDados(){
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o seu nome: ");
        nome = sc.nextLine();

        System.out.print("Digite a agência: ");
        agencia = sc.nextLine();

        System.out.print("Digite o número da conta: ");
        conta = sc.nextInt();

        System.out.print("Digite o saldo: ");
        saldo = sc.nextDouble();
    }

    public void exibirMensagem() {
        String mensagem = String.format(
                "Olá %s, obrigado por criar uma conta em nosso banco. " +
                "Sua agência é %s, conta %d e seu saldo R$%.2f já está disponível para saque.",
                nome, agencia, conta, saldo
        );
        System.out.println(mensagem);
    }
}