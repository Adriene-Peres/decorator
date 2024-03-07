public class Morango extends Sabores{
    public Morango(Sorvete s){
        super(s);
    }

    @Override
    public double preco(){
        return 1.50 + getSabores().preco();
    }
    
}