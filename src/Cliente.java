public class Cliente implements Autenticavel {

    private int senha;

    @Override
    public void setSenha(int senha) {

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
