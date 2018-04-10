public class Address {

    private String country;
    private String city;
    private String street;
    private int house;
    private int apartment;

    public Address(String country, String city, String street, int house) {
        this.country = country;
        this.city = city;
        this.street = street;
        this.house = house;
    }

    public Address(String country, String city, String street, int house, int apartment) {
        this.country = country;
        this.city = city;
        this.street = street;
        this.house = house;
        this.apartment = apartment;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry() {
        this.country = country;
    }

    public String getCity() {
        return city;
    }

    public void setCity() {
        this.city = city;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet() {
        this.street = street;
    }

    public int getHouse() {
        return house;
    }

    public void setHouse() {
        this.house = house;
    }

    public int getApartment() {
        return apartment;
    }

    public void setApartment() {
        this.apartment = apartment;
    }

    public void print() {
        System.out.println(getCountry());
        System.out.println(getCity());
        System.out.println(getStreet());
        System.out.println(getHouse());
        System.out.println(getApartment());
    }
}
