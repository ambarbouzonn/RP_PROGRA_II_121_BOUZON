package mainjardinbotanico;

public class Arbol extends Planta implements Podable {
    private double alturaMaxima;

    public Arbol(double alturaMaxima, String nombre, String ubicacion, String clima) {
        super(nombre, ubicacion, clima);
        this.alturaMaxima = alturaMaxima;
    }

    public double getAlturaMaxima() {
        return alturaMaxima;
    }
    
    @Override
    public void podar() {
        System.out.println("El arbol " + getNombre() + " ha sido podado.");
    }

    @Override
    public String mostrarDetalles() {
        return "Arbol - Nombre: " + getNombre() + ", Ubicacion: " + getUbicacion() + ", Clima: " + getClima() + ", Altura Max: " + alturaMaxima + "m";
    }

}
