package unavarra.is.practica7.ejercicios;

public class Ejercicio3 {
    private enum Mensaje {CORRECTO, HORAS_INCORRECTAS, MINUTOS_INCORRECTOS, SEGUNDOS_INCORRECTOS}

    public static String horaMinutoSegundo(int horas, int minutos, int segundos){
        if(horas>0 && horas<24){
            if(minutos>0 && minutos<60){
                if(segundos>0 && segundos<60){
                    return Mensaje.CORRECTO.toString();
                }
                else{
                    return Mensaje.SEGUNDOS_INCORRECTOS.toString();
                }
            }
            else{
                return Mensaje.MINUTOS_INCORRECTOS.toString();
            }
        }
        return Mensaje.HORAS_INCORRECTAS.toString();
    }

    public static void main(String[] args) {
        System.out.println(horaMinutoSegundo(9,34,23));
        System.out.println(horaMinutoSegundo(25,34,23));
    }
    
}
