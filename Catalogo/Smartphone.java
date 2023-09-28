package Catalogo;
/* Clase Smartphone, con constructor, getters y setters y toString.
 * També implementa el mètode isGammaAlta de la interfície GammaAlta. */

public class Smartphone extends Main implements GammaAlta {
    // Variables del smartphone
    private String marca;
    private String model;
    private double preuBase;
    private boolean accelerometre = false;
    private boolean gps = true;
    private double preuFinal;
    private boolean gammaAlta;
   
    // Constructor del smartphone
    public Smartphone(String marca, String model, double preuBase, boolean accelerometre, boolean gps) {
        this.marca = marca;
        this.model = model;
        this.preuBase = preuBase;
        this.accelerometre = accelerometre;
        this.gps = gps;
        this.preuFinal = preuFinalSmartphone(preuBase);
        this.gammaAlta = isGammaAlta();
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
             + "\n  GPS: " + this.gps
             + "\n  Preu final: " + this.preuFinal
             + "\n  Gamma alta: " + this.gammaAlta; 
    }
    
    public double preuFinalSmartphone(double preuBase) {
        double tmp = preuBase;
        preuBase = preuBase * 2;
        if (this.accelerometre == true) { 
            preuBase += tmp *0.1;
        }
        if (this.gps == true) {
            preuBase += tmp *0.05;
        }
        return preuBase;
    }

    // Método isGammaAlta implementado de GammaAlta
    public boolean isGammaAlta() {
        return this.preuFinal > 700;
    }
}

