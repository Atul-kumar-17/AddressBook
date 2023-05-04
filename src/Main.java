import java.util.ArrayList;
import java.util.List;



public class Main {
    public static void main(String[] args) {
        Contacts c1 = new Contacts("atul","kumar","somewhere","someplace","whatever",244432,940000000,"pvtemail");
        Contacts c2 = new Contacts("amit","singh","somewhere","someplace","whatever",244432,940000000,"pvtemail");
        Contacts c3 = new Contacts("arun","kumar","somewhere","someplace","whatever",223344,940000000,"pvtemail");
        List <Contacts> AddressBook = new ArrayList<Contacts>();
        AddressBook.add(c1);
        AddressBook.add(c2);
        AddressBook.add(c3);
        System.out.println(AddressBook);
    }
}
