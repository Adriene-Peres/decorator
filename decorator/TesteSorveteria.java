public class TesteSorveteria{
    public static void main(String[] args) {
        Sorvete s = new Cestinha("Napolitano");

        s = new Chocolate(s);
        s = new Chocolate(s);
        s = new Creme(s);
        s = new Morango(s);
        s = new Morango(s);

        gerarRelatorio(s);
    }
    
    public static void gerarRelatorio(Sorvete s){
        System.out.println("Tipo do sorvete: " + s.getDescricao() + "\tPreço: " + s.preco() + "\tQuantidade de bolas: " + s.qtdBolas());
    }

}