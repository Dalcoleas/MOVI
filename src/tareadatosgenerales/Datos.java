/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tareadatosgenerales;

/**
 *
 * @author Daniel Alcoleas 
 */
public class Datos {
    
    String nombre;
    String apellido;
    int edad;
    String fecha_nacimiento;
    String tipo_de_sangre;
    String sexo;
    String nacionalidad;
    String ocupacion;
    
    public Datos(String nombre, String apellido, int edad, String fecha_nacimiento , String tipo_de_sangre , String sexo, String nacionalidad, String ocupacion ){
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.fecha_nacimiento = fecha_nacimiento;
        this.tipo_de_sangre = tipo_de_sangre;
        this.sexo = sexo ;
        this.nacionalidad = nacionalidad;
        this.ocupacion = ocupacion;  
    }
    public void mostrar(){
        System.out.println("Mi nombre es: " + nombre + " "+ apellido + ".\t");
        System.out.println("Tengo: " + edad + " años.\t");
        System.out.println("Nací el: " + fecha_nacimiento + ".\t");
        System.out.println("Mi tipo de sangre es: " + tipo_de_sangre + ".\t");
        System.out.println("Mi sexo es: " + sexo + ".\t");
        System.out.println("Mi nacionalidad es: " + nacionalidad + ".\t");
        System.out.println("Actualmente mi ocupacion es: " + ocupacion + ".");
    }
}
