
package Controlador;

import java.util.HashMap;
import java.util.Map;
import rv.firebase.conexionFirebase;

/**
 *
 * @author yael
 */
public class ControlRegistroObras {
    
    public static void agregarObras(String nombre_obra, String genero, String resumen, String duracion, String primer_actor, String segundo_actor,String precio){
    
       Map<String, Object> data = new HashMap<>();
            data.put("nombre", nombre_obra);
            data.put("genero", genero);
            data.put("resumen", resumen);
            data.put("duracion", duracion);
            data.put("primer actor", primer_actor);
            data.put("segundo actor", segundo_actor);
            data.put("precio", precio);
    
            String uuid = java.util.UUID.randomUUID().toString();
            conexionFirebase.insertarDatos("Obras", uuid, data);
    
    
    
    
    
    
    }
    
    
    
    
}
