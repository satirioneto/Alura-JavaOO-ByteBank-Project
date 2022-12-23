public class EditorVideo extends Funcionario {

    @Override
    public double getBonificacao() {
        System.out.println("Chamando método de bonificação do Editor de Video  = R$ 150.00");
        return 150;
    }
}
