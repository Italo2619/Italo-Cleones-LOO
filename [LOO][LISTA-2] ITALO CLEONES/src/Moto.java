public class Moto extends Veiculo{
    private int cilindradas;

    public Moto(String tipo, int cilindradas){
        super(tipo);
        this.cilindradas = cilindradas;
    }

    public int getCilindradas(){
        return cilindradas;
    }

    public void setCilindradas(int cilindradas){
        this.cilindradas = cilindradas;
    }

    public void ExibirCilindadras(){
        System.out.println("CILINDRADAS: " + cilindradas);
    }

    @Override
    public void ligar(){
        System.out.println("Moto: ligada");
    }
}
