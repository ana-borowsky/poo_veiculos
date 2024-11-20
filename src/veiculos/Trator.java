package veiculos;

public class Trator extends Veiculo {
    private int horimetro;
    private String tipoMovimentacao;

    public Trator(String nome, String fabricante, String cor, int ano, String tipoCombustivel, int horimetro, String tipoMovimentacao) {
        super(nome, fabricante, cor, ano, tipoCombustivel);
        this.horimetro = horimetro;
        this.tipoMovimentacao = tipoMovimentacao;
    }

    @Override
    public void imprimeInfo() {
        System.out.println("Trator: " + fabricante + ", Tipo de movimentação: " + tipoMovimentacao);
    }

    public void imprimirHorimetro() {
        System.out.println("Horímetro: " + horimetro);
    }
}
