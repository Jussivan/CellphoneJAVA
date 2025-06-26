package Cellphone;

public class Main {
    public static void main(String[] args) {
        Cellphone meuIphone = new Cellphone();

        meuIphone.selecionarMusica("Bohemian Rhapsody");
        meuIphone.tocar();
        meuIphone.pausar();

        meuIphone.ligar("123456789");
        meuIphone.atender();
        meuIphone.iniciarCorreioVoz();

        meuIphone.exibirPagina("https://google.vom");
        meuIphone.adicionarNovaAba();
        meuIphone.atualizarPagina();
    }
}
