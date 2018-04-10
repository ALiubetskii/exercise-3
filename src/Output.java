public class Output {

    public static void main(String[] agrs) {

        Address address = new Address("Russia", "Saint-Petersburg", "Dybenko", 25);
        address.setCountry();
        address.setCity();
        address.setStreet();
        address.setHouse();
        address.print();

        Address address1 = new Address("Belarus", "Minsk", "V.Horudjei", 25, 45);
        address1.setCountry();
        address1.setCity();
        address1.setStreet();
        address1.setHouse();
        address1.setApartment();
        System.out.println("===============");
        address1.print();

    }
}
