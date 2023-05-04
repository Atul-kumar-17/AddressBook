public class Contacts {
    String firstName;
    String lastName;
    String address;
    String city;
    String State;
    int zip;
    long phoneNumber;
    String Email;

    Contacts(String f, String l, String a, String c, String s, int z, long p, String e ){
        this.firstName = f;
        this.lastName = l;
        this.address = a;
        this.city = c;
        this.State = s;
        this.zip = z;
        this.phoneNumber = p;
        this.Email = e;
    }
    public String toString(){
        return (
                "First Name : " + this.firstName + "; Last Name :  " + this.lastName + "; Address : " + this.address + "; City : "+ this.city+ "; State : " + this.State + "; Zip : " + this.zip + "; PhoneNumber : " +this.phoneNumber+ "; Email : "+ this.Email
        );
    }

}