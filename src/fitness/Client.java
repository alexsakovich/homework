package fitness;

@AccessMode (gym = "16", pool = "16", group = "0")
public class Client extends Human {
    public Client(String name, String surname, int bYear, String regDate) {
        super(name, surname, bYear, regDate);
    }

    public Client(String name, String surname, int bYear) {
        super(name, surname, bYear);
    }
}
