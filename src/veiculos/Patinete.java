package veiculos;

public class Patinete extends Veiculo {
    private boolean eletrico;

    public Patinete(String nome, String fabricante, String cor, int ano, String tipoCombustivel, boolean eletrico) {
        super(nome, fabricante, cor, ano, tipoCombustivel);
        this.eletrico = eletrico;
    }

    @Override
    public void imprimeInfo() {
        System.out.println("Patinete: " + fabricante + ", Elétrico: " + (eletrico ? "Sim" : "Não"));
    }

    public void mostrarAutonomia() {
        System.out.println(eletrico ? "Autonomia de 20 km" : "Não possui autonomia elétrica");
    }
}
