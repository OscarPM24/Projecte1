package Catalogo;

public class altresDispositius {
    String marca = " ";
    String model = " ";
    double preuBase =  0;
    String  descripcio = " ";

    public altresDispositius (String marca, String model,  double preuBase, String descripcio) {
        this.marca= marca;
        this.model= model;
        this.preuBase= preuBase;
        this.descripcio= descripcio;
    }
    

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
        return "altresDispositius{" + "marca= " + marca + ", model= " + model + ", preuBase= " + preuBase + ", descripcio= " + descripcio + '}';
    }
    
    public int preuFinalAltres (double preuBase) { 
        return preuBase*2;
    }
}
