package mainjardinbotanico;

public class Flor extends Planta {
    private TEMPORADA temporadaFlorecimiento;

    public Flor(String nombre, String ubicacion, String clima, TEMPORADA temporadaFlorecimiento) {
        super(nombre, ubicacion, clima);
        this.temporadaFlorecimiento = temporadaFlorecimiento;
    }

    public TEMPORADA getTemporadaFlorecimiento() {
        return temporadaFlorecimiento;
    }

    @Override
    public String mostrarDetalles() {
        return "Flor - Nombre: " + getNombre() + ", Ubicacion: " + getUbicacion() + ", Clima: " + getClima() + ", Temporada de Florecimiento: " + temporadaFlorecimiento;
    }
}
