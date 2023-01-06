public class Gerente extends Funcionario {
    private int senha;

    public double getBonificacao() {
        System.out.println("Chamando método de bonificação do Gerente = 1 SALARIO ");
        // The <super> keyword is used similarly to <this> keyword but references the attribute in superclass
        return super.getSalario();
    }

    public void setSenha(int senha) {
        this.senha = senha;
    }

    public boolean autentica(int senha) {
        // return this.senha == senha;
        if (this.senha == senha){
            return true;
        } else {
            return false;
        }
    }
}
