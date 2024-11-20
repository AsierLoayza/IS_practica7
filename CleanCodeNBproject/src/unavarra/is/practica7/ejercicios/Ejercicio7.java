package unavarra.is.practica7.ejercicios;

public class Ejercicio7 {
    
    public static void evaluarRiesgoCardiovascular(Paciente[] pacientes){
        
        for (Paciente p : pacientes) {
            if (p.tieneRiesgoCardiovascular()){
                System.out.println(p.getNombre() + " tiene riesgo cardiovascular"); 
            }
        }
    }

    public static void main(String[] args) {  
        evaluarRiesgoCardiovascular(new Paciente[]{
            new Paciente("paciente1", 80.2f, 1.84f, 2001),
            new Paciente("paciente2", 90.2f, 1.75f, 1940),
            new Paciente("paciente3", 89.2f, 1.75f, 2001)
        });
    }
    
}
