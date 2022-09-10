public class Address {
    private String country, city, street , fullAddress;


    @Override
    public String toString() {
        return "Address{" +
                "fullAddress='" + fullAddress + '\'' +
                '}';
    }

    public Address(String country, String city, String street) {
        this.country = country;
        this.city = city;
        this.street = street;
        this.fullAddress = this.country + " " + this.city + " " + this.street;
    }

}
