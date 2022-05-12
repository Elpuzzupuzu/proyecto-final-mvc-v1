
package rv.firebase;


import Modelo.Nombres;
import Modelo.Obra;
import com.google.api.core.ApiFuture;
import com.google.cloud.firestore.CollectionReference;
import com.google.cloud.firestore.DocumentSnapshot;
import com.google.cloud.firestore.QuerySnapshot;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;

/**
 *
 * @author yael
 */
public class BDObras {
    
    
    List <Obra> listaObras = new ArrayList<>();
    
    public void buscarNombres() throws InterruptedException, ExecutionException{
    CollectionReference colectionobras = conexionFirebase.bd.collection("Obras");       
    ApiFuture<QuerySnapshot> querySnapshot = colectionobras.get();
    
    for (DocumentSnapshot document : querySnapshot.get().getDocuments()){
        
     
        
        
        Obra obra = new Obra(
                
                document.getString("nombre"),
                document.getString("genero"),
                document.getString("resumen"),
                document.getString("duracion"),
                document.getString("primer_actor"),
                document.getString("segundo_actor"),
                document.getString("precio"));
      
    
        //System.out.println(document.getId());
        listaObras.add(obra);
        }
    }
    
    
    
    
}
