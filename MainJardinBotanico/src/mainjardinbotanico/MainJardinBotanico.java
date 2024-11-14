package mainjardinbotanico;

public class MainJardinBotanico {
    public static void main(String[] args) {
        // Crear el jardín botánico
        JardinBotanico jardin = new JardinBotanico();
        
        try {
            // Agregar algunas plantas
            System.out.println("Agregando plantas al jardin...");
            jardin.agregarPlanta(new Arbol(15.0, "Roble", "Zona Norte", "Templado"));
            jardin.agregarPlanta(new Arbusto("Lavanda", "Zona Sur", "Mediterraneo", 7));
            jardin.agregarPlanta(new Flor("Rosa", "Zona Este", "Templado", TEMPORADA.PRIMAVERA));
            jardin.agregarPlanta(new Flor("Tulipan", "Zona Este", "Templado", TEMPORADA.PRIMAVERA));
            jardin.agregarPlanta(new Arbol(20.0, "Pino", "Zona Oeste", "Frio"));
            
            // Intentar agregar una planta duplicada
            jardin.agregarPlanta(new Arbol(15.0, "Roble", "Zona Norte", "Templado"));

        } catch (PlantaDuplicadaException e) {
            System.out.println("Error: " + e.getMessage());
        }

        // Mostrar todas las plantas en el jardín
        System.out.println("\nPlantas en el jardin:");
        jardin.mostrarPlantas();

        // Realizar la poda de plantas (árboles y arbustos)
        System.out.println("\nPoda de plantas:");
        jardin.podarPlantas();
    }
    
}
