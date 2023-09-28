package Catalogo;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[]args){
        // Creación de la lista
        List<Object> lista = new ArrayList<>();
        //Creación de los dispositivos y los añadimos a la lista
        lista.add(new Smartphone("samsung", "A50",300,false, false));
        lista.add(new Smartphone("iphone", "14",500,true, true));
        lista.add(new Tablet("samsung", "tab6", 400, 10));
        lista.add(new altresDispositius("apple", "watch16", 100, "reloj Inteligente"));
        lista.add(new altresDispositius("HP", " Victus", 800, "portatil gaming"));

        System.out.println("Els dispositius de la llista són: ");
        for (int i = 0; i < lista.size(); i++) {
            System.out.println(lista.get(i));
        }
   }
}