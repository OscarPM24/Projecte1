public class tablets {
private String marca;
private String model;
private int preuBase;
private int pulgadas;

    public tablets(String marca, String model,  int preuBase, int pulgadas) {
        this.marca= marca;
        this.model= model;
        this.preuBase= preuBase;
        this.pulgadas= pulgadas;
    }

    
    @override
    public String toString(){
        return  "\n Marca:  "       + marca 
        +       "\n Modelo: "       + model
        +       "\n Precio Base: "  + preuBase
        +       "\n Pulgadas:   "   + pulgadas;
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


    public int getPreuBase() {
        return preuBase;
    }


    public void setPreuBase(int preuBase) {
        this.preuBase = preuBase;
    }


    public int getPulgadas() {
        return pulgadas;
    }


    public void setPulgadas(int pulgadas) {
        this.pulgadas = pulgadas;
    }

}