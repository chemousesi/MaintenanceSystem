import java.util.ArrayList;
import java.util.Date;

public class Client {

    private String name;
    private String id;
    private Date birthDate;
    private String email;
    private ArrayList<Equipement> equipements;

    public Client(String name, Date birthDate) {
        this.name = name;
        this.birthDate = birthDate;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

}
