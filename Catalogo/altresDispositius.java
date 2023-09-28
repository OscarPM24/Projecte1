package Catalogo;

public class altresDispositius {
    String marca = " ";
    String modelo = " ";
    int PreuBase =  0;
    String  descripcio = " ";

    public altresDispositius() {
        
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getPreuBase() {
        return PreuBase;
    }

    public void setPreuBase(int PreuBase) {
        this.PreuBase = PreuBase;
    }

    public String getDescripcio() {
        return descripcio;
    }

    public void setDescripcio(String descripcio) {
        this.descripcio = descripcio;
    }

    @Override
    public String toString() {
        return "altresDispositius{" + "marca= " + marca + ", modelo= " + modelo + ", PreuBase= " + PreuBase + ", descripcio= " + descripcio + '}';
    }
    
    public int preuFinalAltres (int preuBase) { 
        return preuBase*2;
    }
}
