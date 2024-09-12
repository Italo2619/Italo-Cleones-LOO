public abstract class Veiculo implements IFuncoesVeiculos{
    protected String tipo;
    protected boolean abastecido = false;
    protected int velocidade = 0;

    public Veiculo(String tipo){
        this.tipo = tipo;
    }
    
    public void ExibirTipo(){
        System.out.println("TIPO: " + tipo);
    }

    @Override
    public void abastecer(){
        this.abastecido = true;
        System.err.println(tipo + " abastecido.");
    }

    @Override
    public void acelerar(int velocidade){
        this.velocidade += velocidade;
        System.out.println(tipo + " acelerou " + this.velocidade + " Km/hrs");
    }

    public abstract void ligar();
}
