//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
Dipendente[] dipendenti = new Dipendente[3];
dipendenti[0]= new Dipendente("001", 1500.00, "produzione");
dipendenti[1]= new Dipendente("002", 1600.00,"Vendite");
dipendenti[2]= new Dipendente("002", 1700.00, "admin");

for (Dipendente d : dipendenti){
    System.out.println("Matricola:" + d.getMatricola());
}
    }
}