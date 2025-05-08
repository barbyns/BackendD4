package D3;

public class Volontario implements CheckIn {
    private final String nome;
    private final int eta;
    private final String CV;

    public Volontario(String nome, int eta, String CV) {
        this.nome = nome;
        this.eta = eta;
        this.CV = CV;
    }

    @Override
    public void checkIn() {
        System.out.println("Volontario " + nome + " ha iniziato il servizio.");
    }

    @Override
    public String toString() {
        return "Volontario{" +
                "nome='" + nome + '\'' +
                ", eta=" + eta +
                ", CV='" + CV + '\'' +
                '}';
    }
}
