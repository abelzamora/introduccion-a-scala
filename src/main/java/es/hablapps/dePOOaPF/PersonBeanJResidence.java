package es.hablapps.dePOOaPF;

public class PersonBeanJResidence extends PersonBeanJ implements ResidenceJ {

    private String city;
    private String country = "Spain";

    PersonBeanJResidence(String name, String secondName, boolean deceased, String city) {
        super(name, secondName, deceased);
        this.city = city;
    }

    @Override
    public void setCity(String value) {
        this.city = value;
    }

    @Override
    public String getCity() {
        return city;
    }

    @Override
    public void setCountry(String value) {
        this.country = country;
    }

    @Override
    public String getCountry() {
        return country;
    }
}
