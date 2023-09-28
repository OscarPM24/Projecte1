package Catalogo;
// métodes d'instancia de la class Tablet. Té setters, getters i toString. Marca, model, preu base i nombre de polsades
public class Tablet {
    // CONSTRUCTOR

    private String marca;
    private String model;
    private int preuBase;
    private int pulgadas;

    public Tablet(String marca, String model,  int preuBase, int pulgadas) {
        this.marca= marca;
        this.model= model;
        this.preuBase= preuBase;
        this.pulgadas= pulgadas;
    }

    //SETTERS
    public void setMarca(String marca) { this.marca = marca;}

    public void setModel(String model) {this.model = model; }

    public void setPreuBase(int preu) { this.preuBase = preu; }

    public void setPulgadas(int pulgadas) {this.pulgadas = pulgadas; }

    //GETTERS
    public String getMarca() { return this.marca; }
    public String getModel() { return this.model; }
    public int getPreuBase() { return this.preuBase; }
    public int getPulgadas() { return this.pulgadas; }

    //TO STRING

    @Override
    public String toString(){
        String frase = ("Aquesta tablet té un preu base de " + getPreuBase() + ", és de la marca "+ getMarca()+ " i model" + getModel() + " amb " + getPulgadas() + "polsades");
        return frase;
    }
    
      public int preuFinalTablet (int preuBase) { 
        return preuBase*2;
    }
    
}