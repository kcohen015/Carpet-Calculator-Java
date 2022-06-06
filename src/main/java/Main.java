public class Main {
    public static void main(String[] args) {
        var carpetCalculator = new CarpetCalculator(5.00F);
        carpetCalculator.addRoom(new Room(10, 20));
        carpetCalculator.addRoom(new Room(20, 10));
        System.out.println(carpetCalculator.getTotalCost());

        var carpetCalculator2 = new CarpetCalculator(5.00F, 500.00F);
        carpetCalculator2.addRoom(new Room(10, 20));
        carpetCalculator2.addRoom(new Room(20, 10));
        carpetCalculator2.addRoom(new Room(10, 10));
        System.out.println(carpetCalculator2.getTotalCost());

        var carpetCalculator3 = new CarpetCalculator(5.00F, 500.00F);
        carpetCalculator3.addRoom(new Room(10, 10));
        carpetCalculator3.addPercentDiscount(25);
        System.out.println(carpetCalculator3.getTotalCost());
    }
}


