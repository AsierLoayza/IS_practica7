package unavarra.is.practica7.ejercicios;

public class Ejercicio1 {
    private static Boolean comienzaPorAyAcabaPorS(String linea){
        return linea.startsWith("A") && linea.endsWith("S");
        
    }

    public static void main(String[] args) {
        // Ejercicio 1
        System.out.println(comienzaPorAyAcabaPorS("HOLA"));
        System.out.println(comienzaPorAyAcabaPorS("ADIOS"));
    }
    
}
