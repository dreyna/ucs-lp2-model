
package pe.edu.ucs.ec1.dao;

import java.util.List;
import pe.edu.ucs.ec1.dto.LoginDTO;

/**
 *
 * @author Docente
 */
public interface UsuarioDao {
    public List<LoginDTO> login(String username, String pass);
}
