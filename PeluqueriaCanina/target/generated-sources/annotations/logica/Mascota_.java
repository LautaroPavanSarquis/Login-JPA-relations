package logica;

import javax.annotation.processing.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import logica.Dueño;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2025-12-18T14:23:26", comments="EclipseLink-2.7.10.v20211216-rNA")
@StaticMetamodel(Mascota.class)
public class Mascota_ { 

    public static volatile SingularAttribute<Mascota, Boolean> isAlergic;
    public static volatile SingularAttribute<Mascota, Boolean> needSpecialAtention;
    public static volatile SingularAttribute<Mascota, String> race;
    public static volatile SingularAttribute<Mascota, String> color;
    public static volatile SingularAttribute<Mascota, Dueño> dueño;
    public static volatile SingularAttribute<Mascota, String> name;
    public static volatile SingularAttribute<Mascota, Integer> id;

}