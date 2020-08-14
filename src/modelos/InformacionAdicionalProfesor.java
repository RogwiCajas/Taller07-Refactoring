package modelos;

public class InformacionAdicionalProfesor {
    public int añosdeTrabajo;
    public String facultad;
    public double BonoFijo;
    
    public double calcularSueldo(Profesor prof){
        return this.añosdeTrabajo*600 + this.BonoFijo;
    }  
}
