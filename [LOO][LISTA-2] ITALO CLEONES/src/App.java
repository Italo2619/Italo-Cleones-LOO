public class App {
    public static void main(String[] args) throws Exception {

        System.out.println("DADOS CARRO: ");
        Carro car1 = new Carro("Carro", "Nissan", "Versa", 2017);
        car1.ExibirTipo();
        car1.ExibirInformacoes();
        car1.abastecer();
        car1.acelerar(100);
        System.out.println();
        
        System.out.println("DADOS MOTO");
        Moto moto1 = new Moto("Moto", 150);
        moto1.ExibirTipo();
        moto1.ExibirCilindadras();
        moto1.abastecer();
        moto1.acelerar(50);

        System.out.println();
        Veiculo[] veiculos = new Veiculo[2];
        veiculos[0] = car1;
        veiculos[1] = moto1;

        for (Veiculo veiculo : veiculos){
            veiculo.ligar();
        }
    }

}
