public class Main {

    public static void main(String[] args) {
        BmiService service = new BmiService();
        int yourBmi = service.calculate(74, 1.82);
        System.out.println("Ваш индекс массы тела " + yourBmi);
    }
}
