package questao2;
public class Carro extends Automovel{
    private int qtdPortas;
    public Carro(String marca, int qtdRotas,  String modelo, int velocidade, double potenciaAutomovel, int qtdPortasdoCarro){
        super(marca, qtdRotas, modelo, velocidade, potenciaAutomovel);
        this.qtdPortas = qtdPortasdoCarro;
    }
    void imprimirInformacoes(){
        System.out.println("\n\nCARRO:\nMarca: " + getMarca()+ "\nQuantidade de Rotas: " + getQtdRotas() +"\nModelo " + getModelo()+"\nVelocidade: " + getVelocidade() + "\nPortas no carro:  " + getQtdPortas());
    }

    public void setQtdPortas(int qtdPortasCarro){
        this.qtdPortas = qtdPortasCarro;
    };
    public int getQtdPortas(){
        return this.qtdPortas;
    }
}
