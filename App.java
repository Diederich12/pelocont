import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        

        // instancias de AutoNuevo y AutoUsado
        Auto  auto1 = new AutoNuevo("Toyota", "Corolla", 20000);
        Auto auto2 = new AutoNuevo("Honda", "Civic", 22000);
        Auto auto3 = new AutoUsado("Ford", "Fiesta", 8000);
        Auto auto4 = new AutoUsado("Chevrolet", "Spark", 7000);
        autos.add(auto1);
        autos.add(auto2);
        autos.add(auto3);
        autos.add(auto4);

        recorrerLista();
    }

    public static  ArrayList<Auto> autos = new ArrayList<Auto>();
   
    public static void recorrerLista(){
    
     for (Auto auto : autos) {
         auto.mostrarDetalles();
          auto.tipoAuto();
         System.out.println();
        }

     // Calcular y mostrar el valor total del inventario
     double valorTotal = calcularValorTotal(autos);
     System.out.println("Valor total del inventario: $" + valorTotal);
    }


    

    
 // calcular el valor total del inventario
    public static double calcularValorTotal(ArrayList<Auto> autos) {
     double total = 0;
     for (Auto auto : autos) {
         total += auto.getValor();
        }
     return total;
    }
    
}
