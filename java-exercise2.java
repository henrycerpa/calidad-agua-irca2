
import java.util.ArrayList;
import java.util.List;
import java.util.Collections;
import java.util.Scanner;;
public class reto2 {
    public static void main(String [] args) {
      Scanner entrada = new Scanner(System.in);
      int veces = Integer.parseInt(entrada.nextLine());
      List<String> nombre = new ArrayList<String>();
      List<Float> irca = new ArrayList<Float>();
      List<Double> promedio = new ArrayList<Double>();
      CuerpoDeAgua mensajero = new CuerpoDeAgua();
      for (int i = 0; i < veces; i++){
        System.out.print("");
        String[] lecturas = entrada.nextLine().split(" ");
        String provisionaluno = lecturas[0];
        nombre.add(provisionaluno);
        Float provisionaldos = Float.parseFloat(lecturas[3]);
        irca.add(provisionaldos);
        String respuesta = mensajero.nivel(provisionaluno, provisionaldos);
        mensajero.imprimir(respuesta);
        Double provisionaltres = Double.parseDouble(lecturas[3]);
        promedio.add(provisionaltres);              
      }
      mensajero.Analisis(irca);
      mensajero.Sinriesgo(irca);
      mensajero.Estadistica(promedio);
    }
}