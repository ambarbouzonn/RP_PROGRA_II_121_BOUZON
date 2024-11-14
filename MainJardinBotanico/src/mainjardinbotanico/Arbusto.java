package mainjardinbotanico;

public class Arbusto extends Planta implements Podable {
    private int densidadFollaje;

    public Arbusto(String nombre, String ubicacion, String clima, int densidadFollaje) {
        super(nombre, ubicacion, clima);
        this.densidadFollaje = densidadFollaje;
    }

    public int getDensidadFollaje() {
        return densidadFollaje;
    }

    @Override
    public void podar() {
        System.out.println("El arbusto " + getNombre() + " ha sido podado.");
    }


    @Override
    public String mostrarDetalles() {
        return "Arbusto - Nombre: " + getNombre() + ", Ubicacion: " + getUbicacion() + ", Clima: " + getClima() + ", Densidad Follaje: " + densidadFollaje;
    }

}
