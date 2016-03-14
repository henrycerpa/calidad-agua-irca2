
import java.util.ArrayList;
import java.util.List;
import java.util.Collections;
import java.util.Scanner;
import java.util.stream.DoubleStream;
import java.util.DoubleSummaryStatistics;
import java.util.stream.Collectors;
public class CuerpoDeAgua {
    public String nombre;
    public float irca;
    public String nb;
    public float ir;
    public List<Float> alcaldia = new ArrayList<Float>();
    public List<Float> sinriesgo = new ArrayList<Float>();
    public String respuesta = "";
    public String nivel(String nb, Float ir){
        
        if(ir<=5){
            respuesta = "SIN RIESGO " + nb;
            } else if(ir>=5.1 && ir<=14){ 
                respuesta = "BAJO " + nb;
            } else if(ir>=14.1 && ir<=35){ 
                respuesta = "MEDIO " + nb;
            } else if(ir>=35.1 && ir<=80){ 
                respuesta = "ALTO " + nb;
            } else { 
                respuesta = "INVIABLE SANITARIAMENTE " + nb;
            }
        
        return respuesta;
    }
    
    public void imprimir (String respuesta){
        System.out.println(respuesta);
    }
    public void Analisis(List<Float> irca){    
        float suma = 0;
        
        for(int i = 0; i<irca.size(); i++){
            Float provisional = irca.get(i);
            if(provisional>80 || provisional<35.1){
                suma = suma + 1;
            }
        }
        System.out.printf("%.2f", suma);
        System.out.println("");
    }
    public void Sinriesgo(List<Float> irca){
        for (int i = 0; i < irca.size(); i++){
            Float provisional = irca.get(i);
            if (provisional>0 && provisional<=5) {
                System.out.printf("%.2f", provisional);
                System.out.println("");
                sinriesgo.add(provisional);
            }
        }
         
        if(sinriesgo.size() == 0) {
            System.out.println("NA");
        }
    }
    public void Estadistica(List<Double> lista){
        DoubleSummaryStatistics estadistica = lista.stream().collect(Collectors.summarizingDouble(item -> item));
        System.out.printf("%.2f", estadistica.getAverage());
        System.out.println("");
    }
           
}