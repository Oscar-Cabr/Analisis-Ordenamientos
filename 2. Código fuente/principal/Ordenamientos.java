/*
Autores:
- Cabrera Rojas Oscar
- Chavez Marquez Sergio Antonio
- Noyola Torres Pablo Sebastian
Fecha de última modificación: 23-03-2024
Propósito del archivo: Punto de partida para el funcionamiento del programa. Ejecuta todos los algoritmos las veces necesarias y guarda los resultados de las operaciones promedio para trabajar con ellas. Imprime la tabla de resultados y manda a llamar la escritura de los archivos.
*/

package principal;

import java.util.Scanner;
import ordenamientos.*;
import graficar.Archivos;
import java.util.ArrayList;
import java.util.List;

public class Ordenamientos{
  public static final int RANGO = 99999;
  public static List<Integer> tamaños;
  public static int promedio;
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    tamaños = new ArrayList<Integer>();

    System.out.print("¿De qué tamaño quieres que sea la entrada?\n\t");
    int n = input.nextInt();

    for(int i = 200; i <= n; i += 200)
      tamaños.add(i);

    int[][] tabla = new int[9][tamaños.size()];

    ejecutar(tabla);
  }
  /*
    El orden seguido en la tabla es:
    0. Insertion.
    1. Selection.
    2. Bubble.
    3. Pancake.
    4. Heap.
    5. Quick.
    6. Merge.
    7. Counting.
    8. Radix.
  */
  
  public static void ejecutar(int[][] tabla){
    Scanner input = new Scanner(System.in);
    int repetir;
    do{
      System.out.print("\nContando");
      contarInsertion(tabla);
      contarSelection(tabla);
      contarBubble(tabla);
      contarPancake(tabla);
      contarHeap(tabla);
      contarQuick(tabla);
      contarMerge(tabla);
      contarCounting(tabla);
      contarRadix(tabla);

      imprimirResultados(tabla);

      Archivos.escribirArchivos(tabla);
      
      System.out.println("\n¿Quieres repetir el programa?");
      System.out.print("1. Sí.\n\t");
      repetir = input.nextInt();
    }while(repetir == 1);
  }

  public static void contarInsertion(int[][] tabla){
    System.out.print(".");
    for(int i = 0; i < tamaños.size(); i++){
      promedio = 0;
      for(int j = 0; j < 5; j++){
        int[] array = new int[tamaños.get(i)];;
        Utilerias.setArray(array, tamaños.get(i), RANGO);
        promedio += InsertionSort.insertionSort(array, tamaños.get(i));
      }
      tabla[0][i] = promedio/5;
    }
  }

  public static void contarSelection(int[][] tabla){
    System.out.print(".");
    for(int i = 0; i < tamaños.size(); i++){
      promedio = 0;
      for(int j = 0; j < 5; j++){
        int[] array = new int[tamaños.get(i)];
        Utilerias.setArray(array, tamaños.get(i), RANGO);
        promedio += SelectionSort.selectionSort(array, tamaños.get(i));
      }
      tabla[1][i] = promedio/5;
    }
  }
  
  public static void contarBubble(int[][] tabla){
    System.out.print(".");
    for(int i = 0; i < tamaños.size(); i++){
      promedio = 0;
      for(int j = 0; j < 5; j++){
        int[] array = new int[tamaños.get(i)];
        Utilerias.setArray(array, tamaños.get(i), RANGO);
        promedio += BubbleSort.bubbleSort(array, tamaños.get(i));
      }
      tabla[2][i] = promedio/5;
    }
  }

  public static void contarPancake(int[][] tabla){
    System.out.print(".");
    for(int i = 0; i < tamaños.size(); i++){
      promedio = 0;
      for(int j = 0; j < 5; j++){
        int[] array = new int[tamaños.get(i)];
        Utilerias.setArray(array, tamaños.get(i), RANGO);
        promedio += PancakeSort.pancakeSortBegin(array, tamaños.get(i));
      }
      tabla[3][i] = promedio/5;
    }
  }

  public static void contarHeap(int[][] tabla){
    System.out.print(".");
    for(int i = 0; i < tamaños.size(); i++){
      promedio = 0;
      for(int j = 0; j < 5; j++){
        int[] array = new int[tamaños.get(i)];
        Utilerias.setArray(array, tamaños.get(i), RANGO);
        promedio += HeapSort.heapSort(array, tamaños.get(i));
      }
      tabla[4][i] = promedio/5;
    }
  }

  public static void contarQuick(int[][] tabla){
    System.out.print(".");
    for(int i = 0; i < tamaños.size(); i++){
      promedio = 0;
      for(int j = 0; j < 5; j++){
        int[] array = new int[tamaños.get(i)];
        Utilerias.setArray(array, tamaños.get(i), RANGO);
        promedio += QuickSort.iniciarQuickSort(array, 0, array.length-1);
      }
      tabla[5][i] = promedio/5;
    }
  }

  public static void contarMerge(int[][] tabla){
    System.out.print(".");
    for(int i = 0; i < tamaños.size(); i++){
      promedio = 0;
      for(int j = 0; j < 5; j++){
        int[] array = new int[tamaños.get(i)];
        Utilerias.setArray(array, tamaños.get(i), RANGO);
        promedio += MergeSort.iniciarMergeSort(array, 0, array.length-1);
      }
      tabla[6][i] = promedio/5;
    }
  }

  public static void contarCounting(int[][] tabla){
    System.out.print(".");
    for(int i = 0; i < tamaños.size(); i++){
      promedio = 0;
      for(int j = 0; j < 5; j++){
        int[] array = new int[tamaños.get(i)];
        Utilerias.setArray(array, tamaños.get(i), RANGO);
        promedio += CountingSort.countingSort(array, tamaños.get(i), RANGO);
      }
      tabla[7][i] = promedio/5;
    }
  }

  public static void contarRadix(int[][] tabla){
    System.out.print(".");
    for(int i = 0; i < tamaños.size(); i++){
      promedio = 0;
      for(int j = 0; j < 5; j++){
        int[] array = new int[tamaños.get(i)];
        Utilerias.setArray(array, tamaños.get(i), RANGO);
        promedio += RadixSort.radixSort(array, tamaños.get(i));
      }
      tabla[8][i] = promedio/5;
    }
  }

  public static void imprimirResultados(int[][] tabla){
    System.out.println("\n\nTABLAS DE RESULTADOS DESPUÉS DE REALIZAR EL CONTEO\n");
    
    System.out.println("Tamaño\t|\tInsertion\t|\tSelection\t|\tBubble\t\t|\tPancake");
    for(int i = 0; i < tamaños.size(); i++)
      System.out.println(tamaños.get(i) + "\t|\t" + tabla[0][i] + "\t\t|\t" + tabla[1][i] + "\t\t|\t" + tabla[2][i] + "\t\t|\t" + tabla[3][i]);

    System.out.println("\n\nTamaño\t|\tHeap\t|\tQuick\t|\tMerge");
    for(int i = 0; i < tamaños.size(); i++)
      System.out.println(tamaños.get(i) + "\t|\t" + tabla[4][i] + "\t|\t" + tabla[5][i] + "\t|\t" + tabla[6][i]);

    System.out.println("\n\nTamaño\t|\tCounting\t|\tRadix");
    for(int i = 0; i < tamaños.size(); i++)
      System.out.println(tamaños.get(i) + "\t|\t" + tabla[7][i] + "\t\t|\t" + tabla[8][i]);
  }
}
