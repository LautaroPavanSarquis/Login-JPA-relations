
package logica;

import java.util.ArrayList;
import persistencia.persistenceController;


public class LogicController {
    
    
    persistenceController controlPersis = new persistenceController();
    
    
    //Dueño    
    public void crearDueño(Dueño dueño){
    
        controlPersis.crearDueño(dueño);
    }    
    
    public void eliminarDueño(int id){
        controlPersis.eliminarDueño(id);
    }
    
    public void editarDUEÑO(Dueño dueño){
        controlPersis.editarDueño(dueño);
    }    
    
    public Dueño traerAlumno(int id){
        return controlPersis.traerDueño(id);
    }
    
    public ArrayList<Dueño> traerListaAlumnos(){
        return controlPersis.traerListaDueños();
    }
    
  
    //Mascota
    public void crearMascota(Mascota mascota){
    
        controlPersis.crearMascota(mascota);
    }    
    
    public void eliminarMascota(int id){
        controlPersis.eliminarMascota(id);
    }
    
    public void editarMascota(Mascota mascota){
        controlPersis.editarMascota(mascota);
    }    
    
    public Mascota traerMascota(int id){
        return controlPersis.traerMascota(id);
    }
    
    public ArrayList<Mascota> traerListaMascotas(){
        return controlPersis.traerListaMascotas();
    }   
}
