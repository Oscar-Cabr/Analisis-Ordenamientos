/*
Autores:
- Cabrera Rojas Oscar
- Chavez Marquez Sergio Antonio
- Noyola Torres Pablo Sebastian
Fecha de última modificación: 14-03-2024
Propósito del archivo: Implementación del algoritmo de ordenamiento BubbleSort, devuelve el valor entero del número de operaciones realizadas a partir del arreglo a ordenar y su tamaño.
*/

package ordenamientos;

import principal.Utilerias;

public class BubbleSort{
  static int conteo_comparaciones;
  static int conteo_intercambios;
  static int conteo_operaciones;

  public static int bubbleSort(int[] array, int size){
    conteo_comparaciones = 0;
    conteo_intercambios = 0;
    //int num = 0;
  
    int k = 1;
    for(int i = size-1; i > 0; i--){
      if(k == 0)
        break;
      k = 0;
      for(int j = 0; j < i; j++) {
        ++conteo_comparaciones;
        if(array[j] > array[j+1]){
          Utilerias.swap(array, j, j+1);
          ++conteo_intercambios;
          k = 1;
        }
      }
    }
    conteo_operaciones = conteo_comparaciones + conteo_intercambios;
    
    return conteo_operaciones;
  }
}