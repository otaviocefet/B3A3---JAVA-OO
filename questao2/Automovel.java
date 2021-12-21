package questao2;
public class Automovel extends Veiculo{
    private double potenciaDoMotor;
    public Automovel(String marca, int qtdRotas,  String modelo, int velocidade, double potenciaAutomovel){
        super(marca, qtdRotas, modelo, velocidade);
        this.potenciaDoMotor = potenciaAutomovel;
    }
    void imprimirInformacoes(){
        System.out.println("\n\nAUTOMÓVEL:\nMarca: " + getMarca()+ "\nQuantidade de Rotas: " + getQtdRotas() +"\nModelo " + getModelo()+"\nVelocidade: " + getVelocidade() + "\nPotencia do Aumotóvel: " + getPotenciaDoMotor() + "\n\n");
    }
    public void setPotenciaDoMotor(Double potenciaDoMotorAutomovel){
        this.potenciaDoMotor = potenciaDoMotorAutomovel;
    };
    public Double getPotenciaDoMotor(){
        return this.potenciaDoMotor;
    }
}
