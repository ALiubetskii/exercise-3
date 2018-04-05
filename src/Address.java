public class Address {

    private String Country;
    private String City;
    private String Street;
    private int House;
    private int Appartment;

    public void setCountry() {
        this.Country = "Russia";
    }

    public String getCountry() {
        return Country;
    }

    public void setCity() {
        this.City = "Saint-Petersburg";
    }

    public String getCity() {
        return City;
    }

    public void setStreet() {
        this.Street = "Проспект Менделеева";
    }

    public String getStreet() {
        return Street;
    }

    public void setHouse() {
        this.House = 25;
    }

    public int getHouse() {
        return House;
    }

    public void setAppartment(int appartment) {
        Appartment = 55;
    }

    public int getAppartment() {
        return Appartment;
    }

    public void print() {
        System.out.println(getCountry());
        System.out.println(getCity());
        System.out.println(getStreet());
        System.out.println(getHouse());
        System.out.println(getAppartment());
    }
}
