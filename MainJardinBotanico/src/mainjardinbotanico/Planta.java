package mainjardinbotanico;

abstract class Planta {
    protected String nombre;
    protected String ubicacion;
    protected String clima;

    public Planta(String nombre, String ubicacion, String clima) {
        this.nombre = nombre;
        this.ubicacion = ubicacion;
        this.clima = clima;
    }

    public String getNombre() {
        return nombre;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public String getClima() {
        return clima;
    }
    
    public abstract String mostrarDetalles();

}
