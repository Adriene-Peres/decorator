public class Creme extends Sabores{
    public Creme(Sorvete s){
        super(s);
    }

    @Override
    public double preco(){
        return 3.50 + getSabores().preco();
    }
}