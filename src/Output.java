public class Output {

    public static void main(String[] agrs) {

        Address address = new Address();
        address.setCountry("Russia");
        address.setCity("Saint-Petersburg");
        address.setStreet("Dybenko");
        address.setHouse(25);
        address.setApartment(96);

        address.print();

    }
}
