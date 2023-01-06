public abstract class Funcionario {

    // <abstract> usada para tornar a classe algo abstrato, que representa um conceito. Assim ela não permite instacionar um objeto new Fucionario();
    // A ABSTRAÇÃO está relacionado a HERANÇA como cita o Guanabara no curso de POO dele.

    private String nome;
    private String cpf;
    private double salario;

    // metodo com <abstract> possui corpo e nao tem implementacao
    public abstract double getBonificacao();

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf() {
        this.cpf = cpf;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }


}
