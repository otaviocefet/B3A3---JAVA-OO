package questao2;
public class Moto extends Automovel {
    private boolean partidaEletrica;
    public Moto(String marca, int qtdRotas,  String modelo, int velocidade, double potenciaAutomovel, boolean partidaMoto){
        super(marca, qtdRotas, modelo, velocidade, potenciaAutomovel);
        this.partidaEletrica = partidaMoto;
    }

    void imprimirInformacoes(){
        System.out.println("\n\nMOTO:\nMarca: " + getMarca()+ "\nQuantidade de Rotas: " + getQtdRotas() +"\nModelo " + getModelo()+"\nVelocidade: " + getVelocidade() + "\nExiste Partida Elétrica?  " + getPartidaEletrica());
    }

    public void setPartidaEletrica(Boolean partidaEletricaMoto){
        this.partidaEletrica = partidaEletricaMoto;
    };
    public String getPartidaEletrica(){
        if (this.partidaEletrica){
            return "Sim";
        }else{
            return "Não";
        }
    }
}

