package Catalogo;
/* Clase Smartphone, con constructor, getters y setters y toString */

public class Smartphone {
    // Variables del smartphone
    private String marca;
    private String model;
    private double preuBase;
    private boolean accelerometre = false;
    private boolean gps = true;
   
    // Constructor del smartphone
    public Smartphone(String marca, String model, double preuBase, boolean accelerometre, boolean gps) {
        this.marca = marca;
        this.model = model;
        this.preuBase = preuBase;
        this.accelerometre = accelerometre;
        this.gps = gps;
        
        
        
    }

    // Getters y setters de cada atributo del Smartphone
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

    public boolean isAccelerometre() {
        return accelerometre;
    }

    public void setAccelerometre(boolean accelerometre) {
        this.accelerometre = accelerometre;
    }

    public boolean isGps() {
        return gps;
    }

    public void setGps(boolean gps) {
        this.gps = gps;
    }

    // Método toString, que devuelve un String con los datos del Smartphone
    @Override
    public String toString() {
        return "\n  Marca: " + this.marca
             + "\n  Model: " + this.model
             + "\n  Preu base: " + this.preuBase
             + "\n  Accelerometre: " + this.accelerometre
             + "\n  GPS: " + this.gps;

    }
    
    public double preuFinalSmartphone (double preuBase) {
    if (accelerometre == true) { 
        if(gps == true){ // si gps i acc es true
            preuBase = (preuBase *2) *0.10;
            return preuBase + preuBase*0.05;
        } 
        preuBase = (preuBase *2) *0.10;
        return preuBase; // si acc es true i gps es false
    }
     return preuBase*2;
    
    }
}

