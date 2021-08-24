import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);

        int opcao;
        int tipoMenu = 1;

        double saque;
        double deposito;

        Pessoa pessoa = new Pessoa();
        ContaCorrente conta = new ContaCorrente(pessoa);

        do {
            if (tipoMenu == 1) {
                System.out.println("1. Criar Conta");
                System.out.println("0. Sair");
                System.out.print("Escolha a opção: ");
                opcao = scan.nextInt();
            } else {
                System.out.println("2. Sacar");
                System.out.println("3. Depositar");
                System.out.println("4. Ver Saldo");
                System.out.println("0. Sair");
                System.out.print("Escolha a opção: ");
                opcao = scan.nextInt();
            }

            if (opcao == 0) {
                System.out.println("Até Mais!");
            } else if (opcao == 1) {
                System.out.println("Você escolheu a opção 'Cria Conta'");

                System.out.print("Digite seu nome: ");
                pessoa.nome = scan.next();
                System.out.print("Digite seu CPF: ");
                pessoa.cpf = scan.next();
                System.out.print("Digite sua idade: ");
                pessoa.idade = scan.nextInt();
                System.out.print("Digite seu altura: ");
                pessoa.altura = scan.nextDouble();
                System.out.print("Digite seu peso: ");
                pessoa.peso = scan.nextDouble();
                System.out.print("Digite sua cor de cabelo: ");
                pessoa.corcabelo = scan.next();
                System.out.print("Digite sua agência: ");
                conta.agencia = scan.next();
                System.out.print("Digite seu cartão: ");
                conta.numero = scan.next();

                System.out.println(conta.toString());
                tipoMenu = 2;
            } else if (opcao == 2) {
                System.out.println("Você escolheu a opção 'Sacar'");
                System.out.print("Valor para sacar: ");
                saque = scan.nextDouble();

                if (!conta.sacar(saque)) {
                    System.out.println("Seu saque é maior que seu saldo disponivel!");
                } else {
                    System.out.println("Saldo após sacar: R$" + conta.verSaldo());
                }
            } else if (opcao == 3) {
                System.out.println("Você escolheu a opção 'Depositar'");
                System.out.print("Valor para depositar: ");
                deposito = scan.nextDouble();

                conta.depositar(deposito);
                System.out.println("Saldo após depositar: R$" + conta.verSaldo());
            } else if (opcao == 4) {
                System.out.println("Você escolheu a opção 'Ver Saldo'");
                System.out.println("Seu saldo atual: R$" + conta.verSaldo());
            }

            System.out.println();
        } while (opcao != 0);
    }
}
