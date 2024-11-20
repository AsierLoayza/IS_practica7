package unavarra.is.practica7.ejercicios;

public class Ejercicio6 {
    
        public static char calcularLetraDni(int numDni){
            Dni dni = new Dni(numDni);
            return dni.validarLetra();
        }

    public static void main(String[] args) {
        System.out.println(calcularLetraDni(72700123)); 
    }
}
