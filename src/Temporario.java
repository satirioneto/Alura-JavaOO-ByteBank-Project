public class Temporario extends Funcionario {
    public double getBonificacao(){
        System.out.println("O Funcionário temporário recebe somente a bonificação padrão = 10% DO SALARIO");
        return super.getBonificacao();
    }
}
