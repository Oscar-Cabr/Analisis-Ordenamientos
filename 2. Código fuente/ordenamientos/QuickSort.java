/*
Autores:
- Cabrera Rojas Oscar
- Chavez Marquez Sergio Antonio
- Noyola Torres Pablo Sebastian
Fecha de última modificación: 23-03-2024
Propósito del archivo: Implementación del algoritmo de ordenamiento QuickSort, devuelve el valor entero del número de operaciones realizadas a partir del arreglo a ordenar, el índice cero del arreglo y el índice de su último elemento.
*/

package ordenamientos;

import principal.Utilerias;

public class QuickSort{
  static int conteo_operaciones;

  public static int iniciarQuickSort(int[] array, int low, int high){
    conteo_operaciones = 0;
    quickSort(array, low, high);
    return conteo_operaciones;
  }
  
  public static void quickSort(int[] array, int low, int high){
    int p;
    conteo_operaciones++;
    if(low < high){
      p = partition(array, low, high);
      quickSort(array, low, p-1);
      quickSort(array, p+1, high);
    }
  }
  public static int partition(int[] array, int low, int high){
    int pivot = array[high];
    int i = low-1;
    for(int j = low; j <= high-1; j++){
      if(array[j] <= pivot){
        conteo_operaciones++;
        i++;
        Utilerias.swap(array, i, j);
      }
    }
    Utilerias.swap(array, i+1, high);
    return i+1;
  }
}