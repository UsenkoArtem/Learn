package Table;

/**
 * Created by Artem on 16.12.2016.
 *
 */
public class Person {
    private String Name ;
    private String LastName;
    private String Phone;
    private String email;
    private String Country;

    public Person(String Name, String LastName, String Phone, String email, String Country) {
        this.Name=Name;
        this.LastName=LastName;
        this.Phone=Phone;
        this.email=email;
        this.Country=Country;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }

    public String getPhone() {
        return Phone;
    }

    public void setPhone(String phone) {
        Phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setemail(String email) {
        this.email = email;
    }

    public String getCountry() {
        return Country;
    }

    public void setCountry(String country) {
        Country = country;
    }
}
