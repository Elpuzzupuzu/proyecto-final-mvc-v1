
package Controlador;

import Vista.JFRegistroObras;
import Vista.JFRegistroUsuarios;
import static rv.firebase.conexionFirebase.conectar;

/**
 *
 * @author yael
 */
public class Main_Teatro {
    
    public static void main(String args[]){
    
 
    
    try {
            conectar();
//            JFRegistroUsuarios registrarUsuario = new JFRegistroUsuarios();
//            registrarUsuario.setVisible(true);
            JFRegistroObras registroObra= new JFRegistroObras();
            registroObra.setVisible(true);
        }catch (Exception e){
            e.getMessage();
            
        }
    
    
    }
    
    
    
     
    
}
