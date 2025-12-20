
package logica;
import java.io.Serializable;
import javax.persistence.*;



@Entity 
public class Mascota implements Serializable {
    
    
    //atributos
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    
    @Basic
    private String name;
    private String race;
    private String color;
    private boolean isAlergic;
    private boolean needSpecialAtention;
    
    @ManyToOne
    @JoinColumn(name = "dueno_id")
    Dueño dueño; 
    
    //Contructores

    public Mascota() {
    }

    public Mascota(String name, String race, String color, boolean isAlergic, boolean needSpecialAtention, Dueño dueño) {
        this.name = name;
        this.race = race;
        this.color = color;
        this.isAlergic = isAlergic;
        this.needSpecialAtention = needSpecialAtention;
        this.dueño = dueño;
    }

   
    
    //Getters 
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getRace() {
        return race;
    }

    public String getColor() {
        return color;
    }

    public boolean isIsAlergic() {
        return isAlergic;
    }

    public boolean isNeedSpecialAtention() {
        return needSpecialAtention;
    }

    public Dueño getDueño() {
        return dueño;
    }
    
    

    //Setters
    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setRace(String race) {
        this.race = race;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setIsAlergic(boolean isAlergic) {
        this.isAlergic = isAlergic;
    }

    public void setNeedSpecialAtention(boolean needSpecialAtention) {
        this.needSpecialAtention = needSpecialAtention;
    }

    public void setDueño(Dueño dueño) {
        this.dueño = dueño;
    }
    
    
    
    
    
}
