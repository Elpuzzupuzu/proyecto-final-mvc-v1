
package Modelo;


public class Obra {
    
      
private String nombre_obra;
private String genero;
private String resumen;
private String duracion;
private String primer_actor;
private String segundo_actor;
private String precio;
    public Obra(String nombre_obra, String genero, String resumen, String duracion, String primer_actor, String segundo_actor,String precio) {
        this.nombre_obra = nombre_obra;
        this.genero = genero;
        this.resumen = resumen;
        this.duracion = duracion;
        this.primer_actor = primer_actor;
        this.segundo_actor = segundo_actor;
        this.precio=precio;
    }

    public String getNombre_obra() {
        return nombre_obra;
    }

    public void setNombre_obra(String nombre_obra) {
        this.nombre_obra = nombre_obra;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getResumen() {
        return resumen;
    }

    public void setResumen(String resumen) {
        this.resumen = resumen;
    }

    public String getDuracion() {
        return duracion;
    }

    public void setDuracion(String duracion) {
        this.duracion = duracion;
    }

    public String getPrimer_actor() {
        return primer_actor;
    }

    public void setPrimer_actor(String primer_actor) {
        this.primer_actor = primer_actor;
    }

    public String getSegundo_actor() {
        return segundo_actor;
    }

    public void setSegundo_actor(String segundo_actor) {
        this.segundo_actor = segundo_actor;
    }

    public String getPrecio() {
        return precio;
    }

    public void setPrecio(String precio) {
        this.precio = precio;
    }

   

   
    
    
    
    
    
    
}
