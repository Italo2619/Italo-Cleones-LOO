public class Carro extends Veiculo{
    private String marca;
    private String modelo;
    private int ano;

    public String getMarca(){
        return marca;
    }

    public void setMarca(String marca){
        this.marca = marca;
    }

    public String getModelo(){
        return modelo;
    }

    public void setModelo(String modelo){
        this.modelo = modelo;
    }

    public int getAno(){
        return ano;
    }

    public void setAno(int ano){
        this.ano = ano;
    }

    public Carro(String tipo, String marca, String modelo, int ano){
        super(tipo);
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
    }

    public void ExibirInformacoes(){
        System.out.println("MARCA: " + marca);
        System.out.println("MODELO: " + modelo);
        System.out.println("ANO: " + ano);
    }

    @Override
    public void ligar(){
        System.out.println("Carro: ligado");
    }
}
