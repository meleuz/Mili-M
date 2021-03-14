public class Main {
    public static void main(String[] args) {
        BonusMilesService service = new BonusMilesService();

//        int price = 10_000;
//        int miles = service.calculate(price);
//        System.out.println(miles);

        int costIsCorrect = service.calculate(12500_50);
        System.out.println(costIsCorrect);

        int costIsUnder0 = service.calculate(-12500_50);
        System.out.println(costIsUnder0);

        int costIsLessThan20 = service.calculate(1_00);
        System.out.println(costIsLessThan20);

        int costIs20 = service.calculate(20_00);
        System.out.println(costIs20);
    }
}
