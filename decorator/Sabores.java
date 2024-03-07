public abstract class Sabores extends Sorvete{
    private Sorvete s;

    public Sabores(Sorvete s){
        this.s = s;
        setDescricao(s.getDescricao());
    }
    public Sorvete getSabores(){
        return s;
    }

    @Override
    public int qtdBolas(){
        return 1 + getSabores().qtdBolas();
    }
    
}