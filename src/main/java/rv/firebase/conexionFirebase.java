/*
 * se necesita la versión mas reciente de maven asosciada a net beans
 * para asociarla es necesario irse a: Tools/options/java/maven/maven in execution
 * y finalmente añadir el directorio donde se guardó maven (debe extraerse en archivos de programa)
 * descarga el BINARY ZIP: https://maven.apache.org/download.cgi   
 */
package rv.firebase;

import Vista.JFRegistroUsuarios;
import com.google.auth.oauth2.GoogleCredentials;
import com.google.firebase.FirebaseApp;
import com.google.api.core.ApiFuture;
import com.google.cloud.firestore.Firestore;
import com.google.firebase.cloud.FirestoreClient;
import com.google.firebase.FirebaseOptions;
import com.google.cloud.firestore.DocumentReference;
import com.google.cloud.firestore.WriteResult;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;



/**
 *
 * @author FABRICIO
 */
public class conexionFirebase {
    
    static Firestore bd;
    
    public static void conectar() throws IOException {
        FileInputStream serviceAccount
                = new FileInputStream("javafirebase.json");
        FirebaseOptions options = new FirebaseOptions.Builder()
                .setCredentials(GoogleCredentials.fromStream(serviceAccount))
                .build();
        FirebaseApp.initializeApp(options);
        bd = FirestoreClient.getFirestore();
        System.out.println("Conectado con exito");
    }
    //++++++++++++++++++++++//
    
    
    
    
    //METODO PARA AÑADIR//
    public static boolean insertarDatos(
            String coleccion,
            String documento,
            Map<String, Object> data){
        try {
            DocumentReference docRef = bd.collection(coleccion).document(documento);
            ApiFuture<WriteResult> result = docRef.set(data);
            
            return true;
        }catch (Exception e){
            return false;
        }
    
}


}








//fin clase Fire base


//METODO PARA AGREGAR USUARIOS//

 
    

