package questao2;
public class Bicicleta extends Veiculo {
    private int numMarchas;
    private boolean bagageiro; 
    public Bicicleta(String marca, int qtdRotas,  String modelo, int velocidade, int marchas, boolean existeBagageiro){
        super(marca, qtdRotas, modelo, velocidade);
        this.bagageiro = existeBagageiro;
        this.numMarchas = marchas;
    }
    void imprimirInformacoes(){
        System.out.println("\n\nBICICLETA:\nMarca: " + getMarca()+ "\nQuantidade de Rotas: " + getQtdRotas() +"\nModelo " + getModelo()+"\nVelocidade: " + getVelocidade() + "\nExiste Bagageiro?  " + getBagageiro());
    }
    public void setBagageiro(Boolean bagageiroBicicleta){
        this.bagageiro = bagageiroBicicleta;
    };
    public String getBagageiro(){
        if (this.bagageiro){
            return "Sim";
        }else{
            return "Não";
        }
        
    }
    public void setNumMarchas(int numMarchasBicicleta){
        this.numMarchas = numMarchasBicicleta;
    };
    public int getNumMarchas(){
        return this.numMarchas;
    }
}
