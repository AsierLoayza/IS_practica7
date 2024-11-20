package unavarra.is.practica7.ejercicios;

public class Ejercicio5 {
    
    public static String diasMes(int mes){
        if(mes == 1 || mes == 4 || mes == 6 || mes == 9 || mes == 11){
            return "es un mes 30 días";
        }
        
        if (mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12) {
            return "es un mes 31 días";
        }
        
        if (mes == 2) {
            return "es un mes de 29 o 30 días";
        }
        
        return "Mes incorrecto";  
    }

    public static void main(String[] args) {
        System.out.println(diasMes(11));
    }
    
}
