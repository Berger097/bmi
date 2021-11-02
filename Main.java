public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double result = service.calculate(74, 172);

        System.out.println(result);

    }
}