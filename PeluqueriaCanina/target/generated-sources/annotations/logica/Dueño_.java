package logica;

import javax.annotation.processing.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import logica.Mascota;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2025-12-18T14:23:26", comments="EclipseLink-2.7.10.v20211216-rNA")
@StaticMetamodel(Dueño.class)
public class Dueño_ { 

    public static volatile SingularAttribute<Dueño, String> lastName;
    public static volatile SingularAttribute<Dueño, Integer> phone;
    public static volatile SingularAttribute<Dueño, String> name;
    public static volatile SingularAttribute<Dueño, String> adress;
    public static volatile SingularAttribute<Dueño, Integer> id;
    public static volatile ListAttribute<Dueño, Mascota> listaMascotas;

}