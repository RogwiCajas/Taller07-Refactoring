package modelos;

import java.util.ArrayList;

public class Estudiante extends Persona{
    public String matricula;

    public Estudiante(String matricula, String nombre, String apellido, String facultad, int edad, String direccion, String telefono, ArrayList<Paralelo> paralelos) {
        super(nombre, apellido, facultad, edad, direccion, telefono, paralelos);
        this.matricula = matricula;
    }
    
    
    
    //Getter y setter de Matricula

    public String getMatricula() {
        return matricula;
    }
    public void setMatricula(String m){
        this.matricula=m;
    }
}