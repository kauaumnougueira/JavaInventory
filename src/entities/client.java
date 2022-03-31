package entities;
import java.util.Date;

public class client {
    private String name;
    private String email;
    private Date birthDate;

    public client(){
    }
    public client(String name, String email, Date birthDate){
        this.birthDate = birthDate;
        this.name = name;
        this.email = email;
    }
    public Date getBirthDate() {
        return birthDate;
    }
    public void setBirthDate(Date bithDate) {
        this.birthDate = bithDate;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }

}
