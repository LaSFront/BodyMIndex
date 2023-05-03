public class BmiService {
    public int calculate(int weightKg, double heightM) {
        double bmi; // body mass index
        heightM = Math.pow(heightM, 2);
        bmi = weightKg / heightM;
        return (int) bmi;
    }
}
