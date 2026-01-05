
package Logic;
import java.io.Serializable;
import javax.persistence.*;

@Entity
public class User implements Serializable {
    
    //Atributos
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    
    @Basic
    private String uss;
    private String pass;
    
    //Constructores
    public User() {
    }

    public User(String uss, String pass) {
        this.uss = uss;
        this.pass = pass;
    }
    
    //Getters & Setters
    public int getId() { return id;}
    
    public void setId(int id) {this.id = id;} 

    public String getUss() { return uss;}  

    public void setUss(String uss) { this.uss = uss;}

    public String getPass() {return pass;}

    public void setPass(String pass) { this.pass = pass;}
    
    
    
    
    
    
    
    
    
    
}
