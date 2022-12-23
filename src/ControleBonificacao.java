public class ControleBonificacao {

    private double soma;

    public void registra(Funcionario funcionario) {
        double bonificacao = funcionario.getBonificacao();
        this.soma = this.soma + bonificacao;
        // this.soma += bonificacao;
    }

    public double getSoma() {
        System.out.printf("\nTotal de bonificação para funcionários: \nR$ ");
        return soma;
    }
}
