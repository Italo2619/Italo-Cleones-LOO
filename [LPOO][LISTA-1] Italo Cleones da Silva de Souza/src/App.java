public class App {
    public static void main(String[] args) {
        Carro carro = new Carro("Nissan", "Versa", 2017);
        Moto moto = new Moto(150,"Moto");
        System.out.println("Dados do carro:");
        carro.exibirInformacoes();
        System.out.println("Dados da moto:");
        moto.exibirCilindrada();
        moto.exibirTipo();
        System.out.println("Status dos veiculos:");
        Veiculo[] veiculos = new Veiculo[2];
        veiculos[0] = carro;
        veiculos[1] = moto;
        
        for (Veiculo veiculo : veiculos) {
            veiculo.ligar();
        }
    }
}
