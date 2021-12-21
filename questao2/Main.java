package questao2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        Veiculo veiculo = new Veiculo("Gol",  5,  "G6", 50 );
        Moto moto = new Moto ("Honda", 8,  "CG 160 Titan", 70, 180.0, true);
        Carro carro = new Carro ("Gol",  5,  "G6", 50, 287.0 , 4);
        Bicicleta bicicleta = new Bicicleta ("BMX", 8,  "DRB BIKES FREEWAY", 90, 1, false);
        Automovel automovel = new Automovel ("Honda", 8,  "CG 160 Titan", 70, 180.0);

        System.out.println("Modelos definidos pelos construtores:\nBicicleta: " + bicicleta.getModelo() + "\nCarro: "+ bicicleta.getModelo() + "\nMoto: "+ moto.getModelo()+ "\nAutomóvel: "+ automovel.getModelo() + "\nVeículo (velocidade): "+ veiculo.getVelocidade());

        bicicleta.setModelo("Novo Modelo"); // apenas para provar que os metodos funcionam
        carro.setModelo("Novo Modelo"); // apenas para provar que os metodos funcionam
        moto.setModelo("Novo Modelo"); // apenas para provar que os metodos funcionam
        automovel.setModelo("Novo Modelo"); // apenas para provar que os metodos funcionam

        veiculo.frear(5); // apenas para provar que os metodos funcionam
        veiculo.acelerar(4); // apenas para provar que os metodos funcionam

        System.out.println("\n\nModelos após os métodos:\nBicicleta: " + bicicleta.getModelo() + "\nCarro: "+ bicicleta.getModelo() + "\nMoto: "+ moto.getModelo()+ "\nAutomóvel: "+ automovel.getModelo() + "\nVeículo (Velocidade): "+ veiculo.getVelocidade());

        System.out.println("\n\nTestando agora os métodos de imprimir....\n\n");
        veiculo.imprimirInformacoes();
        carro.imprimirInformacoes();
        moto.imprimirInformacoes();
        automovel.imprimirInformacoes();
        bicicleta.imprimirInformacoes();
        



    }
}
