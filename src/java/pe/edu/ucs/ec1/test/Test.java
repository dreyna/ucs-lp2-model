
package pe.edu.ucs.ec1.test;

import com.google.gson.Gson;
import pe.edu.ucs.ec1.config.Conexion;
import pe.edu.ucs.ec1.dao.RolDao;
import pe.edu.ucs.ec1.dao.UsuarioDao;
import pe.edu.ucs.ec1.daoImpl.RolDaoImpl;
import pe.edu.ucs.ec1.daoImpl.UsuarioDaoImpl;
import pe.edu.ucs.ec1.entity.Rol;

/**
 *
 * @author Docente
 */
public class Test {
  static UsuarioDao udao = new UsuarioDaoImpl();
  static RolDao rdao = new RolDaoImpl();
  static Gson g = new Gson();
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        //System.out.println(g.toJson(rdao.createRol(new Rol(0,"Prueba",1))));
        //System.out.println(g.toJson(rdao.updateRol(new Rol(9,"Prueba333",1))));
       System.out.println(g.toJson(rdao.deleteRol(9)));
        //System.out.println(g.toJson(rdao.readRol(1)));
       //System.out.println(g.toJson(rdao.readAll()));
        /*
        if(Conexion.getConection()!=null){
            System.out.println("1");
        }else{
            System.out.println("0");
        }*/
    }
    
}
