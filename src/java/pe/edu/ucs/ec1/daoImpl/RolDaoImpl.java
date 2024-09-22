
package pe.edu.ucs.ec1.daoImpl;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import pe.edu.ucs.ec1.config.Conexion;
import pe.edu.ucs.ec1.dao.RolDao;
import pe.edu.ucs.ec1.entity.Rol;

/**
 *
 * @author Docente
 */
public class RolDaoImpl implements RolDao{
private PreparedStatement ps;
private ResultSet rs;
private Connection cx;
     @Override
    public int createRol(Rol r) {
        int x = 0;
        String SQL = "INSERT INTO rol(nombre, estado) VALUES(?,1)";
        try {
            cx = Conexion.getConection();
            ps = cx.prepareStatement(SQL);
            ps.setString(1, r.getNombre());
            x = ps.executeUpdate();            
        } catch (SQLException e) {
            System.out.println("Error: "+e);
        }
        return x;
    }

    @Override
    public int updateRol(Rol r) {
        int x = 0;
        String SQL = "UPDATE rol SET nombre=? WHERE idrol=?";
        try {
            cx = Conexion.getConection();
            ps = cx.prepareStatement(SQL);
            ps.setString(1, r.getNombre());
            ps.setInt(2, r.getIdrol());
            x = ps.executeUpdate();            
        } catch (SQLException e) {
            System.out.println("Error: "+e);
        }
        return x;
    }

    @Override
    public int deleteRol(int id) {
        int x = 0;
        String SQL = "DELETE FROM rol WHERE idrol=?";
        try {
            cx = Conexion.getConection();
            ps = cx.prepareStatement(SQL);
            ps.setInt(1, id);
            x = ps.executeUpdate();            
        } catch (SQLException e) {
            System.out.println("Error: "+e);
        }
        return x;
    }

    @Override
    public Rol readRol(int id) {
        Rol re = new Rol();
        String SQL = "SELECT *FROM rol WHERE idrol=?";
        try {
            cx = Conexion.getConection();
            ps = cx.prepareStatement(SQL);
            ps.setInt(1, id);
            rs = ps.executeQuery();
            while(rs.next()){
                re.setIdrol(rs.getInt("idrol"));
                re.setNombre(rs.getString("nombre"));
                re.setEstado(rs.getInt("estado"));                
            }
        } catch (SQLException e) {
            System.out.println("Error: "+e);
        }
        return re;
    }

    @Override
    public List<Rol> readAll() {
        List<Rol> lista = new ArrayList<>();
        String SQL = "SELECT *FROM rol";
        try {
            cx = Conexion.getConection();
            ps = cx.prepareStatement(SQL);
            rs = ps.executeQuery();
            while(rs.next()){
                Rol re = new Rol();
                re.setIdrol(rs.getInt("idrol"));
                re.setNombre(rs.getString("nombre"));
                re.setEstado(rs.getInt("estado"));    
                lista.add(re);
            }
        } catch (SQLException e) {
            System.out.println("Error: "+e);
        }
        return lista;
        
    }
    
}
