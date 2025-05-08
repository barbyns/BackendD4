package D3;

public abstract class Dipendente implements CheckIn {
    private String matricola;
    private DipartimentoTipo dipartimento;

    public Dipendente(String matricola, DipartimentoTipo dipartimento) {
        this.matricola = matricola;
        this.dipartimento = dipartimento;
    }

    public String getMatricola() {
        return matricola;
    }

    public DipartimentoTipo getDipartimento() {
        return dipartimento;
    }

    public void setDipartimento(DipartimentoTipo dipartimento) {
        this.dipartimento = dipartimento;
    }

    public abstract double calculateSalary();

    @Override
    public void checkIn() {
        System.out.println("Dipendente con matricola " + matricola + " ha fatto il check-in.");
    }
}
