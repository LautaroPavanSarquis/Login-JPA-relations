
package Logic;
import Persistence.persistenceController; 
import java.util.List;



public class Controller {
    
    persistenceController persisControl = new persistenceController();
    
    public String validarCuenta(String uss, String pass){
        
        String mensaje = "";
        
        List<User> userList = persisControl.traerUsuarios();  
        
        for(User u : userList){
            if(u.getUss().equals(uss) && u.getPass().equals(pass)){
                mensaje="Bienvenido, Usuario y contraseña correctos";
                return mensaje;
            }else {
                mensaje="ERROR. Usuario y/o contraseña incorrectos";
                return mensaje;
            }
        }
        
        
        
    return mensaje;
    
    }
    
}
