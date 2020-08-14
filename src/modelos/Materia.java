package modelos;

public class Materia {
    public String codigo;
    public String nombre;
    public String facultad;
    public double notaInicial;
    public double notaFinal;
    public double notaTotal;
    
    

    private double CalcularNotaInicial(double nexamen,double ndeberes, double nlecciones, double ntalleres){
        double notaTeorico=(nexamen+ndeberes+nlecciones)*0.80;
        double notaPractico=(ntalleres)*0.20;
        return notaTeorico+notaPractico;
    }
    
    
    private double CalcularNotaFinal(double nexamen,double ndeberes, double nlecciones, double ntalleres){
        double notaTeorico=(nexamen+ndeberes+nlecciones)*0.80;
        double notaPractico=(ntalleres)*0.20;
        return notaTeorico+notaPractico;
    }
    

    private double CalcularNotaTotal(double notaI, double notaF){
        return notaI+notaF/2;
    }
    
}
