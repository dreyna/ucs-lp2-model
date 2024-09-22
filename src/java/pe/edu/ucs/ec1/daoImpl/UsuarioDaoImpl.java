
package pe.edu.ucs.ec1.daoImpl;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import pe.edu.ucs.ec1.config.Conexion;
import pe.edu.ucs.ec1.dao.UsuarioDao;
import pe.edu.ucs.ec1.dto.LoginDTO;

/**
 *
 * @author Docente
 */
public class UsuarioDaoImpl implements UsuarioDao{
    private PreparedStatement ps;
    private ResultSet rs;
    private Connection cx;
    @Override
    public List<LoginDTO> login(String username, String pass) {
        List<LoginDTO> lista = new ArrayList<>();
        String SQL = "SELECT u.idusuario, u.username, e.sexo, r.nombre as rol, p.nombre as menu, p.url, p.icono FROM usuario u " +
                     "inner join empleado e on u.idempleado = e.idempleado " +
                     "inner join rol r on u.idrol=r.idrol " +
                     "inner join rol_privilegio rp on r.idrol = rp.idrol " +
                     "inner join privilegios p on rp.idprivilegio = p.idprivilegio " +
                     "where u.username= ? and u.clave= ?";
        try {
            cx = Conexion.getConection();
            ps = cx.prepareStatement(SQL);
            ps.setString(1, username);
            ps.setString(2, pass);
            rs = ps.executeQuery();
            while(rs.next()){
             LoginDTO ld = new LoginDTO();
             ld.setIdusuario(rs.getInt("idusuario"));
             ld.setUsername(rs.getString("username"));
             ld.setSexo(rs.getString("sexo"));
             ld.setRol(rs.getString("rol"));             
             ld.setMenu(rs.getString("menu"));
             ld.setUrl(rs.getString("url"));
             ld.setIcon(rs.getString("icono"));
             lista.add(ld);
            }
        } catch (SQLException e) {
            System.out.println("Login: "+e);            
        }
      return lista;  
    }
}
