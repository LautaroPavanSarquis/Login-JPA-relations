
package persistencia;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import logica.Dueño;
import logica.Mascota;




public class persistenceController {
    
    
     DueñoJpaController dueñoJPA = new DueñoJpaController();
     
     MascotaJpaController mascotaJPA = new MascotaJpaController();
     
     //-------------------- Dueño ----------------------
     
     public void crearDueño(Dueño dueño) {
        
        try{
            dueñoJPA.create(dueño);
        
        } catch(Exception ex){
            Logger.getLogger(persistenceController.class.getName()).log(Level.SEVERE, null, ex );            
        }              
    }

    public void eliminarDueño(int id) {
        try{
            dueñoJPA.destroy(id);
        
        } catch(Exception ex){
            Logger.getLogger(persistenceController.class.getName()).log(Level.SEVERE, null, ex );            
        }     
    }
    
    public void editarDueño(Dueño dueño){
    
        try{
                dueñoJPA.edit(dueño);

            } catch(Exception ex){
                Logger.getLogger(persistenceController.class.getName()).log(Level.SEVERE, null, ex );
            } 
    }

    public Dueño traerDueño(int id) {
        return dueñoJPA.findDueño(id);
    }

    public ArrayList<Dueño> traerListaDueños() {
        
        List<Dueño> listita = dueñoJPA.findDueñoEntities();
        ArrayList<Dueño> listaDueños = new ArrayList(listita);
                
        return listaDueños;
    }
     
 
     // ---------------------- Mascota ------------------------------
    
     public void crearMascota(Mascota mascota) {
        
        try{
            mascotaJPA.create(mascota);
        
        } catch(Exception ex){
            Logger.getLogger(persistenceController.class.getName()).log(Level.SEVERE, null, ex );            
        }              
    }

    public void eliminarMascota(int id) {
        try{
            mascotaJPA.destroy(id);
        
        } catch(Exception ex){
            Logger.getLogger(persistenceController.class.getName()).log(Level.SEVERE, null, ex );            
        }     
    }
    
    public void editarMascota(Mascota mascota){
    
        try{
                mascotaJPA.edit(mascota);

            } catch(Exception ex){
                Logger.getLogger(persistenceController.class.getName()).log(Level.SEVERE, null, ex );
            } 
    }

    public Mascota traerMascota(int id) {
        return mascotaJPA.findMascota(id);
    }

    public ArrayList<Mascota> traerListaMascotas() {
        
        List<Mascota> listita = mascotaJPA.findMascotaEntities();
        ArrayList<Mascota> listaMacotas = new ArrayList(listita);
                
        return listaMacotas;
    }
     
     
    
}
