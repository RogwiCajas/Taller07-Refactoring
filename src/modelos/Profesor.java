package modelos;

import java.util.ArrayList;

public class Profesor extends Persona{
    public String codigo;
    public int añosdeTrabajo;
    public double BonoFijo;

    public Profesor(String codigo, int añosdeTrabajo, double BonoFijo, String nombre, String apellido, String facultad, int edad, String direccion, String telefono, ArrayList<Paralelo> paralelos) {
        super(nombre, apellido, facultad, edad, direccion, telefono, paralelos);
        this.codigo = codigo;
        this.añosdeTrabajo = añosdeTrabajo;
        this.BonoFijo = BonoFijo;
    }
    
    
    
    
    public void anadirParalelos(Paralelo p){
        paralelos.add(p);
    }
    public double calcularSueldo(){
        return añosdeTrabajo*600 + BonoFijo;
    }
    
}
