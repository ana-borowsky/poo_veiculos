package veiculos;

public class Main {
    public static void main(String[] args) {

        Veiculo trator = new Trator("Trator Agrícola", "John Deere", "Amarelo", 2023, "Diesel", 200, "Esteira");
        Veiculo aviao = new Aviao("Boeing 737", "Boeing", "Branco", 2021, "Querosene de aviação", 5000, 180);
        Veiculo patinete = new Patinete("Patinete Zoom", "Xiaomi", "Preto", 2022, "Elétrico", true);

        trator.imprimeInfo();
        aviao.imprimeInfo();
        patinete.imprimeInfo();

        if (trator instanceof Trator) {
            ((Trator) trator).imprimirHorimetro();
        }

        if (aviao instanceof Aviao) {
            ((Aviao) aviao).imprimirHorasDeVoo();
        }

        if (patinete instanceof Patinete) {
            ((Patinete) patinete).mostrarAutonomia();
        }
    }
}
