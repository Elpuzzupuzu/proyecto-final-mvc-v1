
package     Modelo;

/**
 *
 * @author FABRICIO
 */
public class Nombres {
    private String id;
    private String nombre;
    private String apellido;
    private String curp;
    private String surname;
    private String password;

    public Nombres( String id,String nombre, String apellido, String curp, String surname, String password) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.curp = curp;
        this.surname = surname;
        this.password = password;
    }

    public String getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getCurp() {
        return curp;
    }

    public String getSurname() {
        return surname;
    }

    public String getPassword() {
        return password;
    }
    
}
