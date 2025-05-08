package D3;

public class DipendentePartTime extends Dipendente {
    private int oreLavorate;
    private double pagaOraria;

    public DipendentePartTime(String matricola, DipartimentoTipo dipartimento, int oreLavorate, double pagaOraria){
        super(matricola, dipartimento);
        this.oreLavorate= oreLavorate;
        this.pagaOraria= pagaOraria;
    }

    @Override
    public double calculateSalary() {
        return oreLavorate * pagaOraria;
    }
}

