//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        int kg = 98;
        double m = 1.87;
        int Bmi = service.calculateBmi(kg, m);
        System.out.println(Bmi);
    }
}
