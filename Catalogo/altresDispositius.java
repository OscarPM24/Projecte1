package Catalogo;
public class altresDispositius extends Main {
    private String marca;
    private String model;
    private double preuBase;
    private String descripcio;
    private double preuFinal;

    //Constructor de altresDispositus
    public altresDispositius (String marca, String model,  double preuBase, String descripcio) {
        this.marca= marca;
        this.model= model;
        this.preuBase= preuBase;
        this.descripcio= descripcio;
        this.preuFinal = preuFinalAltres(preuBase);
    }

    //Métodos de clase de altresDispositius
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getPreuBase() {
        return preuBase;
    }

    public void setPreuBase(double preuBase) {
        this.preuBase = preuBase;
    }

    public String getDescripcio() {
        return descripcio;
    }

    public void setDescripcio(String descripcio) {
        this.descripcio = descripcio;
    }
    
    @Override
    public String toString() {
        return "\n  Marca: " + this.marca
             + "\n  Model: " + this.model
             + "\n  Preu base: " + this.preuBase
             + "\n  Descripcio: " + this.descripcio
             + "\n  Preu final: " + this.preuFinal;
        }
    
    public double preuFinalAltres(double preuBase) { 
        return preuBase*2;
    }
}
