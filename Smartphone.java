/* Clase Smartphone, con constructor, getters y setters */

public class Smartphone {
    // Variables del smartphone
    private String marca;
    private String model;
    private int preuBase;
    private String sistema;
    private boolean accelerometre = false;
    private boolean gps = true;
   
    // Constructor del smartphone
    public Smartphone(String marca, String model, int preuBase, String sistema, boolean accelerometre, boolean gps) {
        this.marca = marca;
        this.model = model;
        this.preuBase = preuBase;
        this.sistema = sistema;
        this.accelerometre = accelerometre;
        this.gps = gps;
    }
}
