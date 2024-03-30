/*
Autores:
- Cabrera Rojas Oscar
- Chavez Marquez Sergio Antonio
- Noyola Torres Pablo Sebastian
Fecha de última modificación: 22-03-2024
Propósito del archivo: Escribir los archivos de texto de cada ordenamiento, cuyo contenido es el valor promedio de operaciones para cada tamaño realizado.
*/

package graficar;

import principal.Ordenamientos;
import java.io.FileWriter;
import java.io.IOException;

public class Archivos{
  public static FileWriter writer = null;
  public static String[] nombre_archivos = {"insertion.txt", "selection.txt", "bubble.txt", "pancake.txt", "heap.txt", "quick.txt", "merge.txt", "counting.txt", "radix.txt", "tamanios.txt"};
  
  public static void escribirArchivos(int[][] tabla){
    try{
      for(int i = 0; i < nombre_archivos.length-1; i++){
        writer = new FileWriter(nombre_archivos[i]);
        for(int j = 0; j < Ordenamientos.tamaños.size(); j++)
          writer.write(tabla[i][j] + "\n");
        writer.close();
      }
      writer = new FileWriter(nombre_archivos[nombre_archivos.length-1]);
      for(int i = 0; i < Ordenamientos.tamaños.size(); i++)
        writer.write(String.valueOf(Ordenamientos.tamaños.get(i)) + "\n");
      writer.close();
      System.out.println("\nLos archivos se han escrito satisfactoriamente.");
    }catch(IOException e){
      System.out.println("Error al escribir los archivos:\t" + e.getMessage());
    }
  }
}
