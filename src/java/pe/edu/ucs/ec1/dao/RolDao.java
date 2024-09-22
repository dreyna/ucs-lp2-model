

package pe.edu.ucs.ec1.dao;

import java.util.List;
import pe.edu.ucs.ec1.entity.Rol;

/**
 *
 * @author Docente
 */
public interface RolDao {
    int createRol(Rol r);
    int updateRol(Rol r);
    int deleteRol(int id);
    Rol readRol(int id);
    List<Rol> readAll(); 
}
