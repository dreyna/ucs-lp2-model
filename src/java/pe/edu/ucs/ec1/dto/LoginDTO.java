
package pe.edu.ucs.ec1.dto;
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
public class LoginDTO {
    private int idusuario;
    private String username;
    private String sexo;
    private String rol;
    private String menu;
    private String url;
    private String icon;
}
