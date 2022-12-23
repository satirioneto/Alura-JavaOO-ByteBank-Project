public class TestReferencias {
    public static void main(String[] args) {
        Gerente gerente = new Gerente();
        gerente.setNome("Geisse");
        gerente.setSalario(10000);

        EditorVideo editorVideo = new EditorVideo();
        editorVideo.setNome("Eduardo");
        editorVideo.setSalario(5000);

        Designer designer = new Designer();
        designer.setSalario(2000);

        ControleBonificacao controleBonificacao = new ControleBonificacao();

        controleBonificacao.registra(gerente);
        controleBonificacao.registra(editorVideo);
        controleBonificacao.registra(designer);

        System.out.println(controleBonificacao.getSoma());
    }
}
