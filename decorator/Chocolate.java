public class Chocolate extends Sabores{
    public Chocolate(Sorvete s){
        super(s);
    }

    @Override
    public double preco(){
        return 2.50 + getSabores().preco();
    }

}