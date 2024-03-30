/*
Autores:
- Cabrera Rojas Oscar
- Chavez Marquez Sergio Antonio
- Noyola Torres Pablo Sebastian
Fecha de última modificación: 14-03-2024
Propósito del archivo: Implementación del algoritmo de ordenamiento SelectionSort, devuelve el valor entero del número de operaciones realizadas a partir del arreglo a ordenar y su tamaño.
*/

package ordenamientos;

import principal.Utilerias;

public class SelectionSort{
  static int conteo_operaciones;
  static int conteo_comparaciones;
  static int conteo_intercambios;
  
  public static int selectionSort(int[] array, int size){
    int indice_menor;
    conteo_intercambios = 0;
    conteo_comparaciones = 0;
    

    for(int i = 0; i < size-1; i++){
      indice_menor = i;
      for(int j = i+1; j < size; j++){
      ++conteo_comparaciones;
      if(array[j] < array[indice_menor])
        indice_menor = j;
      }
      if(i != indice_menor){
        Utilerias.swap(array, i, indice_menor);    
        ++conteo_intercambios;
      }
    }

    return conteo_intercambios+conteo_comparaciones;
  }
}