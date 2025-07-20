public class main {
    public static void main(String[] args) {
        Smartphone meuSmartphone = new Smartphone();

        meuSmartphone.tocar();
        meuSmartphone.selecionarMusica("Musica - 123");
        meuSmartphone.pausar();

        meuSmartphone.ligar("11999999999");
        meuSmartphone.atender();
        meuSmartphone.iniciarCorreioVoz();

        meuSmartphone.exibirPagina("www.google.com.br");
        meuSmartphone.adicionarNovaAba();
        meuSmartphone.atualizarPagina();
    }
}
