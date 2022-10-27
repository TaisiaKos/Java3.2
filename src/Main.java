public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double imt = service.calculate(64, 162);
        System.out.println(imt);
    }
}
