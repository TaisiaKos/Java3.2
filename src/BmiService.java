public class BmiService {
    public double calculate(double weight, double height) {
        double result;
        result = (weight / ((height * height) / 10000));
        return result;
    }
}
