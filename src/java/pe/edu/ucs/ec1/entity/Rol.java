
package pe.edu.ucs.ec1.entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
/**
 *
 * @author Docente
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Rol {
    private int idrol;
    private String nombre;
    private int estado;
}
