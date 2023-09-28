package Catalogo;
/* Classe Tablet que conté el constructor de Tablet, métodes d'instancia de la class Tablet.
 * Té setters, getters i toString. Marca, model, preu base i nombre de polsades.
 * També implementa el mètode isGammaAlta de la interfície GammaAlta */

public class Tablet extends Main {
    // CONSTRUCTOR

    private String marca;
    private String model;
    private double preuBase;
    private int pulgadas;
    private double preuFinal;
    private boolean gammaAlta;

    public Tablet(String marca, String model,  double preuBase, int pulgadas) {
        this.marca= marca;
        this.model= model;
        this.preuBase= preuBase;
        this.pulgadas= pulgadas;
        this.preuFinal = preuFinalTablet(preuBase);
        this.gammaAlta = isGammaAlta();
    }

    //SETTERS
    public void setMarca(String marca) { this.marca = marca;}

    public void setModel(String model) {this.model = model; }

    public void setPreuBase(int preu) { this.preuBase = preu; }

    public void setPulgadas(int pulgadas) {this.pulgadas = pulgadas; }

    //GETTERS
    public String getMarca() { return this.marca; }
    public String getModel() { return this.model; }
    public double getPreuBase() { return this.preuBase; }
    public int getPulgadas() { return this.pulgadas; }

    //TO STRING

    @Override
    public String toString(){
        return "\n  Marca: " + this.marca
             + "\n  Model: " + this.model
             + "\n  Preu base: " + this.preuBase
             + "\n  Polzades: " + this.pulgadas
             + "\n  Preu final: " + this.preuFinal
             + "\n  Gamma alta: " + this.gammaAlta;
    }
    
      public double preuFinalTablet (double preuBase) { 
        return preuBase*2;
    }

    // Método isGammaAlta implementado de GammaAlta
    public boolean isGammaAlta() {
        return this.preuFinal > 900;
    }
}