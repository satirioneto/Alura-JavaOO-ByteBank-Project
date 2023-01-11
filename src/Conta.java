public abstract class Conta {
    protected double saldo;
    private int agencia;
    private int numero;
    private Cliente titular = new Cliente();

    // STATIC VARIABLE who will receive the total number of classes [Conta] created
    private static int total;

    // Constructor Conta();
    public Conta(int agencia, int numero) {
        if (agencia <= 0 || numero <= 0) {
            System.out.println("Agência ou Número da conta inválida.");
        } else {
            this.numero = numero;
            this.agencia = agencia;
            Conta.total++;
            System.out.println("O total de contas é " + Conta.total);
            System.out.println("Estou criando a conta " + this.numero + " na Agência " + this.agencia);
        }

    }

    public abstract void deposita(double valor);

    public boolean saca(double valor) {
        if (this.saldo >= valor) {
            this.saldo -= valor;
            return true;
            // Esse [return] encerra o programa confirmando que o saque deu certo
        } else {
            System.out.println("Saldo insuficiente, sua transação não foi concluída.");
            return false;
        }
    }

    // A VARIÁVEL [titular] refere-se ao OBJETO [Conta]
    public boolean transfere(double valor, Conta destino) {
        if (this.saca(valor)) {
            destino.deposita(valor);
            return true;
        } else {
            return false;
        }
    }

    public double getSaldo() {
        return this.saldo;
    }

}
