package D3;

public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        CheckIn[] persone = new CheckIn[4];

        persone[0] = new DipendenteFullTime("001", DipartimentoTipo.VENDITE, 1700.00);
        persone[1] = new DipendentePartTime("002", DipartimentoTipo.PRODUZIONE, 80, 10.0);
        persone[2] = new Dirigente("003", DipartimentoTipo.AMMINISTRAZIONE, 2500.00, 500.00);
        persone[3] = new Volontario("Anna", 30, "CV breve");

        for (CheckIn p : persone) {
            p.checkIn();

        }

        double totaleStipendi = 0;

        for (CheckIn p : persone) {
            if (p instanceof Dipendente d) {
                double salario = d.calculateSalary();
                System.out.println("Matricola: " + d.getMatricola() + " - Stipendio: €" + salario);
                totaleStipendi += salario;
            }

        }

        System.out.println("Totale stipendi: €" + totaleStipendi);
    }
}
