package veiculos;

public class Aviao extends Veiculo {
    private int horasDeVoo;
    private int capacidade;

    public Aviao(String nome, String fabricante, String cor, int ano, String tipoCombustivel, int horasDeVoo, int capacidade) {
        super(nome, fabricante, cor, ano, tipoCombustivel);
        this.horasDeVoo = horasDeVoo;
        this.capacidade = capacidade;
    }

    @Override
    public void imprimeInfo() {
        System.out.println("Avião: " + fabricante + ", Capacidade: " + capacidade);
    }

    public void imprimirHorasDeVoo() {
        System.out.println("Horas de voo: " + horasDeVoo);
    }
}
