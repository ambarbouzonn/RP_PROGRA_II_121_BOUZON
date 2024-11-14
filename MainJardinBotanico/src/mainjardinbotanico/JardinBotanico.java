package mainjardinbotanico;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class JardinBotanico {
    private List<Planta> plantas;
    
    public JardinBotanico() {
        plantas = new ArrayList<>();
    }
    
    public void agregarPlanta(Planta planta) throws  PlantaDuplicadaException {
        for (Planta p : plantas) {
            if (p.getNombre().equals(planta.getNombre()) && p.getUbicacion().equals(planta.getUbicacion())) {
                throw new PlantaDuplicadaException("Ya existe una planta con el nombre '" + planta.getNombre() + "' en la ubicacion '" + planta.getUbicacion() + "'.");
            }
        }
        plantas.add(planta);
    }
    
    public void mostrarPlantas() {
        for (Planta planta : plantas) {
            System.out.println(planta.mostrarDetalles());
        }
    }
    
    public void podarPlantas() {
        for (Planta planta : plantas) {
            if (planta instanceof Podable) {
                ((Podable) planta).podar();
            } else {
                System.out.println("La flor " + planta.getNombre() + " no es podable.");
            }
        }
    }
}
