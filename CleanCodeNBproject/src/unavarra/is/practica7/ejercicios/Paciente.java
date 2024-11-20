/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unavarra.is.practica7.ejercicios;

import java.time.LocalDate;

/**
 *
 * @author alumno
 */
public class Paciente {
    private String nombre;
    private int anioNacimiento;
    private float peso;
    private float altura;
    
    public Paciente(String nombre, float peso, float altura,int anioNacimiento)  {
        this.nombre = nombre;
        this.anioNacimiento = anioNacimiento;
        this.peso = peso;
        this.altura = altura;
    }
    
    public String getNombre()   {
        return this.nombre;
    }
    
    private int calcularEdad()    {
        return LocalDate.now().getYear() - anioNacimiento;
    }
    
    private float calcularIMC() {
        return (float)(peso/Math.pow(altura,2));
                
    }
    
    public boolean tieneRiesgoCardiovascular()  {
        return calcularIMC()>25.00 && calcularEdad()>65;
    }
}
