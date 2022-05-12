
package Controlador;

import java.util.HashMap;
import java.util.Map;
import Modelo.Nombres;
import rv.firebase.conexionFirebase;

/**
 *
 * @author yael
 */
public class ControlRegistroUsuarios {
    
    
    
    public static void agregarUsuario(String nombre, String apellido, String curp, String surname, String password){
//    Nombres usuario= new Nombres(id,nombre,apellido,curp,surname,password);
    
    
            Map<String, Object> data = new HashMap<>();
            data.put("nombre", nombre);
            data.put("apellido", apellido);
            data.put("curp", curp);
            data.put("surname", surname);
            data.put("password", password);
    
            String uuid = java.util.UUID.randomUUID().toString();
            conexionFirebase.insertarDatos("nombres", uuid, data);
    
    
    }
    
    
    
}//fin control usuarios

