
package Persistence;

import Logic.User;
import Persistence.UserJpaController; 
import java.util.List;
        
public class persistenceController {
    
    private UserJpaController userJpa = new UserJpaController();

    public List<User> traerUsuarios() {
        return userJpa.findUserEntities();
    }
    
     
    
    
}
