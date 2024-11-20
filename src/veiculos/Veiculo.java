package veiculos;

public class Veiculo {
    private String nome;
    protected String fabricante;
    protected String cor;
    protected int ano;
    protected String tipoCombustivel;

    public Veiculo(String nome, String fabricante, String cor, int ano, String tipoCombustivel) {
        this.nome = nome;
        this.fabricante = fabricante;
        this.cor = cor;
        this.ano = ano;
        this.tipoCombustivel = tipoCombustivel;
    }

    public Veiculo() {
        this.nome = "Genérico";
        this.fabricante = "Genérico";
        this.cor = "Genérico";
        this.ano = 1950;
        this.tipoCombustivel = "Genérico";
    }

    public void ligar() {
        System.out.println("Veículo ligado!");
    }

    public void imprimeInfo() {
        System.out.println("Veículo: " + nome + ", Fabricante: " + fabricante);
    }
}
