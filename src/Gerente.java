// Gerente eh um Funcionario, logo Gerente herda da classe Funcionario, assina o contrato (inteface) Autenticavel
public class Gerente extends Funcionario implements Autenticavel {

    private int senha;

    public double getBonificacao() {
        System.out.println("Chamando método de bonificação do Gerente = 1 SALARIO ");
        // A palavra-chave <super> é usada siliarmente ao <this> mas referência os atributos da superclasse (classe mãe)
        return super.getSalario();
    }

    @Override
    public void setSenha(int senha) {
        this.senha = senha;
    }

    @Override
    public boolean autentica(int senha) {
        // return this.senha == senha;
        if (this.senha == senha) {
            return true;
        } else {
            return false;
        }
    }
}
