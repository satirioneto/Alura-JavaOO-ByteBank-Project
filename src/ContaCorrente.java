public class ContaCorrente extends Conta {
    // Construtor com <super> herdando da classe <Conta()>
    public ContaCorrente(int agencia, int numero) {
        super(agencia, numero);
    }

    @Override
    public void deposita(double valor) {
        super.saldo += +valor;
    }

    @Override
    //Adiciona novas características ao método saca original
    public boolean saca(double valor) {
        System.out.println("Chama do método Override na ContaCorrente");
        double valorASacar = valor + 0.2;
        return super.saca(valorASacar);
    }
}
