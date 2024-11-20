package unavarra.is.practica7.ejercicios;

public class Ejercicio4 {
    
    public static String calcularDia(int dia){
        
        String[] dias = {"Lunes", "Martes", "Miercoles", "Jueves", "Viernes", "Sabado", "Domingo"};
        if (dia > 7 || dia < 1) {
            return "Dia incorrecto";
        }
        return dias[dia - 1];
        
    }

    public static void main(String[] args) {
        System.out.println(calcularDia(3));
    }
    
}
