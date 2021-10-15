public class Main {
    public static void main(String[] args) {
        BonusMilesService service = new BonusMilesService();
        int costTicket = 13_300;
        int mile = service.calculate(costTicket);
        System.out.println(mile + " Бонусых миль будет получено за покупку авиабилета");
    }
}
