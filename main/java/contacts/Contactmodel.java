package contacts;

public class Contactmodel {
    String firstname;
    String lastName;
    String address;
    String city;
    String state;
    int zip;
    int phonenumber;
    String email;
    public Contactmodel(String firstname,String lastName,String address,String city,String state,int zip,int phonenumber,String email)
    {
        this.firstname = firstname;
        this.lastName = lastName;
        this.address = address;
        this.city = city;
        this.state = state;
        this.zip = zip;
        this.phonenumber = phonenumber;
        this.email = email;
    }

    public Contactmodel(String firstname, String lastName, String address, String city, int zip, int phonenumber, String email) {
    }

    public String firstname()
    {
        return firstname;
    }
    public void setAddress(String firstname) {
        this.firstname = firstname;
    }

    public String toString()
    {
        return String.format(firstname+" "+lastName+" "+address+" "+city+" "+state+" "+zip+" "+phonenumber+" "+email);
    }
}
