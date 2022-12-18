import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Seja bem vindo(a) ao ByteBank");

        System.out.print("Digite a agência: ");
        int agencia = sc.nextInt();
        System.out.print("Digite a número da conta: ");
        int numero = sc.nextInt();

        if (agencia <= 0 || numero <= 0) {
            System.out.println("Dados inválidos");
            return;
        }


        Conta contaDoPaulo = new Conta(agencia, numero);
        Conta contaDaAna = new Conta(123, 12321);


        int opcao = 0;
        do {
            System.out.println("=================================================");
            System.out.println("Digite o número referente a operação que deseja: ");
            System.out.println("1 - SALDO");
            System.out.println("2 - DEPOSITO");
            System.out.println("3 - SAQUE");
            System.out.println("4 - TRANSFERÊNCIA");
            System.out.println("5 - SAIR");
            System.out.println("=================================================");

            opcao = sc.nextInt();

            switch (opcao) {
                // SALDO
                case 1:
                    System.out.println("Seu saldo é de : R$ " + contaDoPaulo.getSaldo() + "\n");
                    break;

                // DEPOSITO
                case 2:
                    System.out.print("Quanto deseja depositar? \nR$ ");
                    contaDoPaulo.deposita(sc.nextDouble());
                    System.out.println("Seu saldo atual é de : R$ " + contaDoPaulo.getSaldo() + "\n");
                    break;

                // SAQUE
                case 3:
                    System.out.println("Seu saldo bancério é: R$ " + contaDoPaulo.getSaldo());
                    System.out.println("Quanto deseja sacar? \nR$ ");
                    contaDoPaulo.saca(sc.nextDouble());
                    System.out.println("Seu saldo atual é de : R$ " + contaDoPaulo.getSaldo());
                    break;

                // TRANSFERÊNCIA
                case 4:
                    System.out.print("Valor a transferir: \nR$ ");
                    int valorTrasferido = sc.nextInt();
                    if (contaDoPaulo.transfere(valorTrasferido, contaDaAna)) {
                        System.out.println("Seu saldo atual é: R$ " + contaDoPaulo.getSaldo());
                    } else {
                        System.out.println("Você não possui saldo suficiente para essa transação.");
                        System.out.println("Seu saldo atual é: R$ " + contaDoPaulo.getSaldo());
                    }
                    break;

                //SAIR
                case 5:
                    System.out.println("Obrigado por contar conosco, volte sempre!");
                    opcao += 1;
                    break;

                default:
                    System.out.println("Entrada inválida");
            }

            System.out.println("Deseja voltar para o Menu de opções?");
            System.out.println("[1] para SIM");
            System.out.println("[2] para NÃO");
            int voltar = sc.nextInt();
            if (voltar == 2) {
                return;
            }

        } while (opcao > 0 && opcao <= 5);
    }
}
