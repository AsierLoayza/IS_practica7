/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unavarra.is.practica7.ejercicios;

/**
 *
 * @author alumno
 */
public class Dni {
    private String letras = "TRWAGMYFPDXBNJZSQVHLCKE";
    private int dniNum;
    
    public Dni(int dniNum)  {
        this.dniNum = dniNum;
    }
    
    public char validarLetra() {
        Integer r = dniNum % 23;
        return letras.charAt(r);
    }
}
