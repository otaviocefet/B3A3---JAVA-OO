package questao2;
public class Veiculo {
    private String marca;
    private int qtdRotas;
    private String modelo;
    private int velocidade;
    public Veiculo(String marcaVeiculo, int qtdRotasVeiculo, String modeloVeiculo,  int velocidadeVeiculo){
        this.marca= marcaVeiculo;
        this.qtdRotas= qtdRotasVeiculo;
        this.modelo = modeloVeiculo;
        this.velocidade=velocidadeVeiculo; 
    };


    void imprimirInformacoes(){
        System.out.println("\n\nVEICULO:\nMarca: " + getMarca()+ "\nQuantidade de Rotas: " + getQtdRotas() +"\nModelo " + getModelo()+"\nVelocidade: " + getVelocidade());
    };

    void acelerar(int valor){
        this.velocidade = this.velocidade+valor;

    };
    void frear (int valor){
        this.velocidade = this.velocidade-valor;
    };






    public void setMarca(String marcaVeiculo){
        this.marca = marcaVeiculo;
    };
    public String getMarca(){
        return this.marca;
    }
    public void setQtdRotas(int qtdRotasVeiculo){
        this.qtdRotas = qtdRotasVeiculo;
    };
    public int getQtdRotas(){
        return this.qtdRotas;
    };
    public void setModelo(String modeloVeiculo){
        this.modelo = modeloVeiculo;
    };
    public String getModelo(){
        return this.modelo;
    };
    public void setVelocidade(int velocidadeVeiculo){
        this.velocidade = velocidadeVeiculo;
    };
    public int getVelocidade(){
        return this.velocidade;
    };
}
