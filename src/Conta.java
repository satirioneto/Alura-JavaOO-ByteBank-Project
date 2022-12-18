public class Conta {
    private double saldo;
    private int agencia;
    private int numero;
    private Cliente titular = new Cliente();
    // STATIC VARIABLE who will receive the total number of classes [Conta] created
    private static int total;

    // Constructor Conta();
    public Conta(int agencia, int numero){
        while (total == 0) {
            if (agencia <= 0 || numero <= 0) {
                System.out.println("Agência ou Número da conta inválida.");
                break;
            } else {
                this.numero = numero;
                this.agencia = agencia;
                Conta.total++;
            }
        }
    }

    public void deposita(double valor){
        this.saldo+= valor;
    }

    public boolean saca(double valor){
        if (this.saldo >= valor){
            this.saldo -= valor;
            return true;
            // Esse [return] encerra o programa confirmando que o saque deu certo
        } else {
            System.out.println("Saldo insuficiente");
            return false;
        }
    }
    // A VARIÁVEL [titular] refere-se ao OBJETO [Conta]
    public boolean transfere(double valor, Conta contaDestino){
        if (this.saldo >= valor){
            this.saldo -= valor;
            contaDestino.deposita(valor);
            return true;
        }
        return false;
    }

    public double getSaldo(){
        return this.saldo;
    }

}
