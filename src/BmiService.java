public class BmiService {

    public int calculateBmi(int kg, double m) {
           int Bmi = (int) (kg / (m*m));
           return Bmi;

    }
}
