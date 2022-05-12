
package rv.firebase;

import Modelo.Nombres;
import com.google.api.core.ApiFuture;
import com.google.cloud.firestore.CollectionReference;
import com.google.cloud.firestore.DocumentSnapshot;
import com.google.cloud.firestore.QuerySnapshot;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;

/**
 *
 * @author FABRICIO
 */
public class BNombres {
    
    List <Nombres> listaNombres = new ArrayList<>();
    
    public void buscarNombres() throws InterruptedException, ExecutionException{
    CollectionReference cnombres = conexionFirebase.bd.collection("nombres");       
    ApiFuture<QuerySnapshot> querySnapshot = cnombres.get();
    
    for (DocumentSnapshot document : querySnapshot.get().getDocuments()){
        Nombres nombres = new Nombres(
                document.getId(),
                document.getString("nombre"),
                document.getString("apellido"),
                document.getString("curp"),
                document.getString("surname"),
                document.getString("password"));
        //System.out.println(document.getId());
        listaNombres.add(nombres);
        }
    }
}
