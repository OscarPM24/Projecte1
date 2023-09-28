package Catalogo;
/* Clase Smartphone, con constructor, getters y setters y toString.
 * També implementa el mètode isGammaAlta de la interfície GammaAlta. */

public class Smartphone {
    // Variables del smartphone
    private String marca;
    private String model;
    private int preuBase;
    private boolean accelerometre = false;
    private boolean gps = true;
   
    // Constructor del smartphone
    public Smartphone(String marca, String model, int preuBase, boolean accelerometre, boolean gps) {
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

    public int getPreuBase() {
        return preuBase;
    }

    public void setPreuBase(int preuBase) {
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
    
    // Mètode implementat de la interfície GammaAlta
    public boolean isGammaAlta() {
        return preuFinal > 700;
    }
}
