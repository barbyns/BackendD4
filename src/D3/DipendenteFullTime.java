package D3;

public class DipendenteFullTime extends Dipendente {
    private final double stipendioMensile;

    public DipendenteFullTime(String matricola, DipartimentoTipo dipartimento, double stipendioMensile) {
        super(matricola, dipartimento);
        this.stipendioMensile = stipendioMensile;
    }

    @Override
    public double calculateSalary() {
        return stipendioMensile;
    }

    @Override
    public void checkIn() {
        System.out.println("Dipendente FullTime con matricola " + getMatricola() + " ha iniziato il turno.");
    }

    @Override
    public String toString() {
        return "DipendenteFullTime{" +
                "matricola='" + getMatricola() + '\'' +
                ", dipartimento=" + getDipartimento() +
                ", stipendioMensile=" + stipendioMensile +
                '}';
    }
}
