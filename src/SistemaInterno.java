public class SistemaInterno {
    private int senha = 2222;

    public void autentica(Gerente gerente) {
        boolean autenticou = gerente.autentica(this.senha);
        if (autenticou) {
            System.out.println("Acesso permitido, pode entrar no sistema!");
        } else {
            System.out.println("Acesso não permitido.");
        }

    }
}
