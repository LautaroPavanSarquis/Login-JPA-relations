
package logica;
import java.io.Serializable;
import java.util.LinkedList;
import javax.persistence.*;

@Entity
public class Dueño implements Serializable{
    
    //Atributos
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    
    @Basic
    private String name;
    private String lastName;
    private int phone;
    private String adress; 
    
   
    @OneToMany(mappedBy = "dueño", cascade = CascadeType.PERSIST)
    private LinkedList<Mascota> listaMascotas;
    
    //Constructores

    public Dueño() {
    }

    public Dueño(String name, String lastName, int phone, String adress, LinkedList<Mascota> listaMascotas) {
        this.name = name;
        this.lastName = lastName;
        this.phone = phone;
        this.adress = adress;
        this.listaMascotas = listaMascotas;
    }
    
    //Getters

    public int getId() {
        return id;
    }
       
    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public int getPhone() {
        return phone;
    }

    public String getAdress() {
        return adress;
    }

    public LinkedList<Mascota> getListaMascotas() {
        return listaMascotas;
    }
    
    //Setters 

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public void setListaMascotas(LinkedList<Mascota> listaMascotas) {
        this.listaMascotas = listaMascotas;
    }
    


    
    
   
    
    
}
